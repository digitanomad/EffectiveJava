package org.effectivejava.examples.chapter05.item27;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Using a recursive type bound to express mutual comparability - Pages 132-133
 *
 * @since 2016. 6. 25.
 * @author Digitanomad
 */
public class RecursiveTypeBound {
	// Returns the maximum value in a list - uses recursive type bound
	public static <T extends Comparable<T>> T max(List<T> list) {
		Iterator<T> i = list.iterator();
		T result = i.next();
		while (i.hasNext()) {
			T t = i.next();
			if (t.compareTo(result) > 0) {
				result = t;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		List<String> argList = Arrays.asList("a", "c", "z");
		System.out.println(max(argList));
	}
}
