package org.effectivejava.examples.chapter10.item69;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/**
 * Simple framework for timing concurrent execution
 *
 * @since 2016. 8. 13.
 * @author Digitanomad
 */
public class ConcurrentTimer {
	private ConcurrentTimer() {
		// Noninstantiable
	}
	
	public static long time(Executor executor, int concurrency, final Runnable action) throws InterruptedException {
		final CountDownLatch ready = new CountDownLatch(concurrency);
		final CountDownLatch start = new CountDownLatch(1);
		final CountDownLatch done = new CountDownLatch(concurrency);
		
		for (int i = 0; i < concurrency; i++) {
			executor.execute(new Runnable() {
				@Override
				public void run() {
					// Tell timer we're ready
					ready.countDown();
					
					try {
						// Wait till peers are ready
						start.wait();
						action.run();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					} finally {
						// Tell timer we're done
						done.countDown();
					}
				}
			});
		}
		
		// Wait for all workers to be ready
		ready.await();
		long startNanos = System.nanoTime();
		// And they're off!
		start.countDown();
		// Wait for all workers to finish
		done.await();
		return System.nanoTime();
	}
}
