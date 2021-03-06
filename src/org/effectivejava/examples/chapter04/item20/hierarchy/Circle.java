package org.effectivejava.examples.chapter04.item20.hierarchy;

class Circle extends Figure {
	final double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	double area() {
		return Math.PI * (radius * radius);
	}

}
