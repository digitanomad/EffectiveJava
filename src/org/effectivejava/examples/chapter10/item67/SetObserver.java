package org.effectivejava.examples.chapter10.item67;

/**
 * Set observer callback interface - Page 266
 *
 * @since 2016. 8. 6.
 * @author Digitanomad
 * @param <E>
 */
public interface SetObserver<E> {
	// Invoked when an element is added to the observable set
	void added(ObservableSet<E> set, E element);
}
