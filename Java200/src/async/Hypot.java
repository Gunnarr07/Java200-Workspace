package async;

import java.util.concurrent.Callable;

public class Hypot {
	private double side1;
	private double side2;
	
	public Hypot(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public Callable<Double> process() {
		return new Callable<Double>() {
			public Double call() throws Exception {
				return Math.sqrt((side1 * side1) + (side2 * side2));
			}
		};
	}
}
