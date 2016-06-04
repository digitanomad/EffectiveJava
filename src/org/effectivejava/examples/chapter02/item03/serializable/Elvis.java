package org.effectivejava.examples.chapter02.item03.serializable;

/**
 * Serializable singleton with public final field - Page 18
 *
 * @since 2016. 6. 4.
 * @author Digitanomad
 */
public class Elvis {
	public static final Elvis INSTANCE = new Elvis();
	
	private Elvis() {
	}
	
	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}
	
	// readResolve method to preserve singleton property
	private Object readResolve() {
		// Return the one true Elvis and let the garbage collector
		// take care of the Elvis impersonator.
		return INSTANCE;
	}
	
	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}
