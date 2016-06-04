package org.effectivejava.examples.chapter02.item04;

/**
 * Noninstantiable utility class
 *
 * @since 2016. 6. 4.
 * @author Digitanomad
 */
public class UtilityClass {
	// Suppress default constructor for noninstantiablity
	private UtilityClass() {
		throw new AssertionError();
	}
}
