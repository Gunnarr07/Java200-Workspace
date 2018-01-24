package wednesday;

import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.random.MersenneTwister;

public class FractionsFun {
	public static void main(String[] args) {
		Fraction f = new Fraction(.2734);
		System.out.println(f);
		
		MersenneTwister generator = new MersenneTwister();
		int i = generator.nextInt();
		System.out.println(i);
	}
}
