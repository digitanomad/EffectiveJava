package org.effectivejava.examples.chapter11.item77.enumSingleton;

import java.util.Arrays;

/**
 * Enum singleton - the preferred approach - Page 311
 *
 * @since 2016. 8. 14.
 * @author Digitanomad
 */
public enum Elvis {
	INSTANCE;
	private String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };
	
	public void printFavorites() {
		System.out.println(Arrays.toString(favoriteSongs));
	}
}
