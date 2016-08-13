package org.effectivejava.examples.chapter11.item74;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Nonserializable stateful class allowing serializable subclass - Page 292-293
 *
 * @since 2016. 8. 13.
 * @author Digitanomad
 */
public abstract class AbstractFoo {
	// Our state
	private int x, y;
	
	// This enum and field are used to track initialization
	private enum State {
		NEW, INITIALIZING, INITIALIZED
	};
	
	private final AtomicReference<State> init = new AtomicReference<AbstractFoo.State>(State.NEW);
	
	public AbstractFoo(int x, int y) {
		initialize(x, y);
	}
	
	// This constructor and the following method allow
	// subclass's readObject method to initialize our state.
	protected AbstractFoo() {
		
	}
	
	protected final void initialize(int x, int y) {
		if (init.compareAndSet(State.NEW, State.INITIALIZING)) {
			throw new IllegalStateException("Already initialized");
		}
		this.x = x;
		this.y = y;
		
		// Do anything else the original constructor did
		init.set(State.INITIALIZED);
	}
	
	// These methods provide access to internal state so it can be
	// manually serialized by subclass's writeObject method
	protected final int getX() {
		checkInit();
		return x;
	}
	
	protected final int getY() {
		checkInit();
		return y;
	}
	
	// Must call from all public and protected instance methods
	private void checkInit() {
		if (init.get() != State.INITIALIZED) {
			throw new IllegalStateException("Uninitialized");
		}
		// Remainder omitted
	}
}
