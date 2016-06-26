package org.effectivejava.examples.chapter05.item28;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Using a recursive type bound with wildcards - Page 138-139
 *
 * @since 2016. 6. 25.
 * @author Digitanomad
 */
public class RecursiveTypeBound {
	public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
		Iterator<? extends T> i = list.iterator();
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
