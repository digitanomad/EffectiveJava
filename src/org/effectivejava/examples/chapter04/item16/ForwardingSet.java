package org.effectivejava.examples.chapter04.item16;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Reusable forwarding class - Page 84
 *
 * @since 2016. 6. 18.
 * @author Digitanomad
 * @param <E>
 */
public class ForwardingSet<E> implements Set<E> {
	private final Set<E> s;
	
	public ForwardingSet(Set<E> s) {
		this.s = s;
	}
	
	@Override
	public boolean add(E arg0) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return s.addAll(c);
	}

	@Override
	public void clear() {
		s.clear();
	}

	@Override
	public boolean contains(Object o) {
		return s.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return s.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return s.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return s.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return s.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return s.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return s.retainAll(c);
	}

	@Override
	public int size() {
		return s.size();
	}

	@Override
	public Object[] toArray() {
		return s.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return s.toArray(a);
	}
	
	@Override
	public boolean equals(Object o) {
		return s.equals(o);
	}
	
	@Override
	public int hashCode() {
		return s.hashCode();
	}
	
	@Override
	public String toString() {
		return s.toString();
	}
}
