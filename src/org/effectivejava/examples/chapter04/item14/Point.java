package org.effectivejava.examples.chapter04.item14;

/**
 * Encapsulation of data by accessor method and mutators
 *
 * @since 2016. 6. 12.
 * @author Digitanomad
 */
class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
