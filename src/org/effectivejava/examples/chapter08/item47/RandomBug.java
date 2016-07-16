package org.effectivejava.examples.chapter08.item47;

import java.util.Random;

/**
 * Random number generation is hard! - Page 47
 *
 * @since 2016. 7. 12.
 * @author Digitanomad
 */
public class RandomBug {
	private static final Random rnd = new Random();
	
	// Common but deeply flawed!
	static int random(int n) {
		return Math.abs(rnd.nextInt()) % n;
	}
	
	public static void main(String[] args) {
		int n = 2 * (Integer.MAX_VALUE / 3);
		int low = 0;
		for (int i = 0; i < 1000000; i++) {
//			if (random(n) < n / 2)
			if (rnd.nextInt(n) < n / 2) {
				low++;
			}
		}
		
		System.out.println(low);
	}
}
