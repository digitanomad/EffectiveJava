package org.effectivejava.examples.chapter06.item34;

/**
 * Emulated extensible enum using an interface - Basic implementation - Page 165
 *
 * @since 2016. 7. 2.
 * @author Digitanomad
 */
public enum BasicOperation implements Operation {
	PLUS("+") {
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		@Override
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		@Override
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		@Override
		public double apply(double x, double y) {
			return x / y;
		}
	};
	
	private final String symbol;
	
	BasicOperation(String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return symbol;
	}

}
