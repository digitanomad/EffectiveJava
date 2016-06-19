package org.effectivejava.examples.chapter04.item18;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;

/**
 * Concrete implementation built atop skeletal implementation - Page 95
 *
 * @since 2016. 6. 19.
 * @author Digitanomad
 */
public class IntArrays {
	static List<Integer> intArrayAsList(final int[] a) {
		if (a == null) {
			throw new NullPointerException();
		}
		
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				return a[index]; // Autoboxing (Item 5)
			}
			
			@Override
			public Integer set(int index, Integer element) {
				int oldVal = a[index];
				a[index] = element; // Auto-unboxing
				return oldVal; // Autoboxing
			}

			@Override
			public int size() {
				return a.length;
			}
			
		};
	}
	
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		List<Integer> list = intArrayAsList(a);
		
		Collections.shuffle(list);
		System.out.println(list);
	}
}
