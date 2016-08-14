package org.effectivejava.examples.chapter11.item75;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * StringList with a resonable custom serialized form
 *
 * @since 2016. 8. 13.
 * @author Digitanomad
 */
public class StringList implements Serializable{
	private transient int size = 0;
	private transient Entry head = null;
	
	// No longer Serializable
	private static class Entry {
		String data;
		Entry next;
		Entry previous;
	}
	
	// Appends the specified string to the list
	public final void add(String s) {
		// Implementation omitted
	}
	
	/**
	 * Serialize this {@code StringList} instance.
	 * 
	 * @serialData the size of the list (the number of strings it contains) is
	 * 			   emitted ({@code int}), followed by all of its elements (each
	 *             a {@code String}), in the proper sequence.
	 */
	private void writeObject(ObjectOutputStream s) throws IOException {
		s.defaultWriteObject();
		s.writeInt(size);
		
		// Write out all elements in the proper order.
		for (Entry e = head; e != null; e = e.next) {
			s.writeObject(e.data);
		}
	}
	
	private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
		s.defaultReadObject();
		int numElements = s.readInt();
		
		// Read in all elements and insert them in list
		for (int i = 0; i < numElements; i++) {
			add((String)s.readObject());
		}
	}
	
	private static final long serialVersionUID = 7061247939755350569L;
	// Remainder omitted
}
