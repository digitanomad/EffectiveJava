package org.effectivejava.examples.chapter04.item21;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
	// Singleton to save on unnecessary object creation costs
	private StringLengthComparator() {
	}
	public static final StringLengthComparator INSTANCE = new StringLengthComparator();
	
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}
