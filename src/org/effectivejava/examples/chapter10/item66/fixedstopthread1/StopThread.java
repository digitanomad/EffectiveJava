package org.effectivejava.examples.chapter10.item66.fixedstopthread1;

import java.util.concurrent.TimeUnit;

/**
 * Properly synchronized cooperative thread termination - Page 261
 *
 * @since 2016. 8. 6.
 * @author Digitanomad
 */
public class StopThread {
	private static boolean stopRequested;
	
	private static synchronized void requestStop() {
		stopRequested = true;
	}
	
	private static synchronized boolean stopRequested() {
		return stopRequested;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread backgroundThread = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (!stopRequested()) {
					i++;
				}
			}
		});
		backgroundThread.start();
		
		TimeUnit.SECONDS.sleep(1);
		requestStop();
	}
}
