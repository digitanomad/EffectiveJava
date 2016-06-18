package org.effectivejava.examples.chapter04.item16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Broken - Inappropriate use of inheritance!
 *
 * @since 2016. 6. 18.
 * @author Digitanomad
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
	// The number of attempted element insertions
	private int addCount = 0;
	
	public InstrumentedHashSet() {
	}
	
	public InstrumentedHashSet(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}
	
	@Override
	public boolean add(E arg0) {
		addCount++;
		return super.add(arg0);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}
	
	public int getAddCount() {
		return addCount;
	}
	
	public static void main(String[] args) {
		InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();
		s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(s.getAddCount());
	}
}
