package org.effectivejava.examples.chapter04.item17;

import java.util.Date;

public class Sub extends Super {
	// Blank final, set by constructor
	private final Date date;
	
	Sub() {
		date = new Date();
	}
	
	// Overriding method invoked by superclass constructor
	@Override
	public void overrideMe() {
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.overrideMe();
	}
}
