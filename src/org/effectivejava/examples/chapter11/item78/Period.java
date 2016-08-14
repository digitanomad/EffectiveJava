package org.effectivejava.examples.chapter11.item78;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * Period class with serialization proxy - Page 312-313
 *
 * @since 2016. 8. 14.
 * @author Digitanomad
 */
public class Period implements Serializable {
	private final Date start;
	private final Date end;
	
	/**
	 * @param start
	 *            the beginning of the period
	 * @param end
	 *            the end of the period; must not precede start
	 * @throws IllegalArgumentException
	 *             if start is after end
	 * @throws NullPointerException
	 *             if start or end is null
	 */
	public Period(Date start, Date end) {
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());
		if (this.start.compareTo(this.end) > 0)
			throw new IllegalArgumentException(start + " after " + end);
	}
	
	public Date start() {
		return new Date(start.getTime());
	}

	public Date end() {
		return new Date(end.getTime());
	}

	public String toString() {
		return start + " - " + end;
	}
	
	// Serialization proxy for Period class - Page 312
	private static class SerializationProxy implements Serializable {
		// Any number will do (Item 75)
		private static final long serialVersionUID = 5276192184002469595L;
		
		private final Date start;
		private final Date end;
		
		public SerializationProxy(Period p) {
			this.start = p.start;
			this.end = p.end;
		}
		
		// readResolve method for Period.SerializationProxy - Page 313
		private Object readResolve() {
			// Uses public constructor
			return new Period(start, end);
		}
	}
	
	// writeReplace method for the serialization proxy pattern - Page 312
	private Object writeReplace() {
		return new SerializationProxy(this);
	}
	
	// readObject method for the serialization proxy pattern - Page 313
	private void readObject(ObjectInputStream stream)
			throws InvalidObjectException {
		throw new InvalidObjectException("Proxy required");
	}
}
