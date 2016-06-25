package org.effectivejava.examples.chapter05.item25;

/**
 * Generic Function interface - Page 122
 *
 * @since 2016. 6. 25.
 * @author Digitanomad
 * @param <T>
 */
interface Function<T> {
	T apply(T arg1, T arg2);
}
