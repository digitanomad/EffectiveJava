package org.effectivejava.examples.chapter02.item03.field;

/**
 * Singleton with public final field - Page 17
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
	
	// This code would normally appear outside the class
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}

}
