package org.effectivejava.examples.chapter03.item08;

/**
 * Simple immutable two-dimensional integer point class - Page 37
 *
 * @since 2016. 6. 5.
 * @author Digitanomad
 */
public class Point {
	private final int x;
	private final int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}
		
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}
	
	// Borken - violates Liskov substitution principle - Pages 39-40
	/*@Override
	public boolean equals(Object o) {
		if (o == null || o.getClass() != getClass()) {
			return false;
		}
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}*/
	
	// See Item 9
	@Override
	public int hashCode() {
		return 31 * x + y;
	}
}
