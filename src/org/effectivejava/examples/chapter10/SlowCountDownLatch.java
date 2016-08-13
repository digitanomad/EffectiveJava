package org.effectivejava.examples.chapter10;

/**
 * Awful CountDownLatch implementation - busy-waits incessantly!
 *
 * @since 2016. 8. 13.
 * @author Digitanomad
 */
public class SlowCountDownLatch {
	private int count;
	
	public SlowCountDownLatch(int count) {
		if (count < 0) {
			throw new IllegalArgumentException(count + " < 0");
		}
		this.count = count;
	}
	
	public void await() {
		while (true) {
			synchronized (this) {
				if (count == 0) {
					return;
				}
			}
		}
	}
	
	public synchronized void countDown() {
		if (count != 0) {
			count--;
		}
	}
}
