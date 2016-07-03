package org.effectivejava.examples.chapter06.item35;

/**
 * Program containing marker annotations - Page 170
 *
 * @since 2016. 7. 3.
 * @author Digitanomad
 */
public class Sample {
	@Test
	public static void m1() {
		// Test should pass
	}
	
	public static void m2() {
	}
	
	@Test
	public static void m3() {
		// Test should fail
		throw new RuntimeException("Boom");
	}
	
	public static void m4() {
	}
	
	@Test
	public void m5() {
		// INVALID USE : nonstatic method
	}
	
	public static void m6() {
	}
	
	@Test
	public static void m7() {
		// Test should fail
		throw new RuntimeException("Crash");
	}
	
	public static void m8() {
	}
}
