package org.effectivejava.examples.chapter10.item67;

import java.util.HashSet;

/**
 * Simple test of ObservableSet - Page 266
 *
 * @since 2016. 8. 6.
 * @author Digitanomad
 */
public class Test1 {
	public static void main(String[] args) {
		ObservableSet<Integer> set = new ObservableSet<Integer>(new HashSet<Integer>());
		
		set.addObserver(new SetObserver<Integer>() {
			@Override
			public void added(ObservableSet<Integer> set, Integer element) {
				System.out.println(element);
			}
		});
		
		for (int i = 0; i < 100; i++) {
			set.add(i);
		}
	}
}
