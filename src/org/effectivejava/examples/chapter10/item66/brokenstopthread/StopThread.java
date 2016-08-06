package org.effectivejava.examples.chapter10.item66.brokenstopthread;

import java.util.concurrent.TimeUnit;

/**
 * Broken! - How long would you expect this program to run? - Page 259
 *
 * @since 2016. 8. 6.
 * @author Digitanomad
 */
public class StopThread {
	private static boolean stopRequested;
	
	public static void main(String[] args) throws InterruptedException {
		Thread backgroundThread = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (!stopRequested) {
					i++;
				}
			}
		});
		backgroundThread.start();
		
		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	}
}
