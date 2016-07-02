package org.effectivejava.examples.chapter06.item34;

/**
 * Emulated extensible enum using an interface - Page 165
 *
 * @since 2016. 7. 2.
 * @author Digitanomad
 */
public interface Operation {
	double apply(double x, double y);
}
