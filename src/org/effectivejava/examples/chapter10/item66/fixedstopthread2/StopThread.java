package org.effectivejava.examples.chapter10.item66.fixedstopthread2;

import java.util.concurrent.TimeUnit;

/**
 * Cooperative thread termination with a volatile field
 *
 * @since 2016. 8. 6.
 * @author Digitanomad
 */
public class StopThread {
	private static volatile boolean stopRequested;

	public static void main(String[] args) throws InterruptedException {
		Thread backgroundThread = new Thread(new Runnable() {
			public void run() {
				int i = 0;
				while (!stopRequested)
					i++;
			}
		});
		backgroundThread.start();

		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	}
}
