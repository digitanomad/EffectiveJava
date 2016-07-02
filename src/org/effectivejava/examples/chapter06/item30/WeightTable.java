package org.effectivejava.examples.chapter06.item30;

/**
 * Takes earth-weight and prints table of weights on all planets - Page 150
 *
 * @since 2016. 7. 2.
 * @author Digitanomad
 */
public class WeightTable {
	public static void main(String[] args) {
		double earthWeight = 72.5;
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values()) {
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
		}
	}
}
