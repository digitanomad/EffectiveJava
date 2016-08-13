package org.effectivejava.examples.chapter11.item74;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Serializable subclass of nonserializable stateful class - Page 293-294
 *
 * @since 2016. 8. 13.
 * @author Digitanomad
 */
public class Foo extends AbstractFoo implements Serializable {
	
	private static final long serialVersionUID = 3910821320992852490L;

	private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
		s.defaultReadObject();
		
		// Manually deserializable and initialize superclass state
		int x = s.readInt();
		int y = s.readInt();
		initialize(x, y);
	}
	
	private void writeObject(ObjectOutputStream s) throws IOException {
		s.defaultWriteObject();
		
		// Manually serialize superclass state
		s.writeInt(getX());
		s.writeInt(getY());
	}
	
	// Constructor does not use the fancy mechanism
	public Foo(int x, int y) {
		super(x, y);
	}
}
