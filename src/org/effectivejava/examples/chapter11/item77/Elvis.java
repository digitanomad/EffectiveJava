package org.effectivejava.examples.chapter11.item77;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Broken singleton - has nontransient object reference field! - Page 309
 *
 * @since 2016. 8. 14.
 * @author Digitanomad
 */
public class Elvis implements Serializable {
	public static final Elvis INSTANCE = new Elvis();
	
	private Elvis() {
	}
	
	private String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };
	
	public void printFavorites() {
		System.out.println(Arrays.toString(favoriteSongs));
	}
	
	private Object readResolve() throws ObjectStreamException {
		return INSTANCE;
	}
}
