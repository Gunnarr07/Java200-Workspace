package tuesday.numberpair;

public class NumberPair {
	private double firstNumber;
	private double secondNumber;
	
	public NumberPair() {
		this(0.0, 0.0);
	}
	
	public NumberPair(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	/**
	 * 
	 * @return
	 */
	public double calcSum() {
		return this.getFirstNumber() + this.getSecondNumber();
	}
	
	/**
	 * 
	 * @return
	 */
	public double calcDifference() {
		return this.getFirstNumber() - this.getSecondNumber();
	}
	
	@Override
	public String toString() {
		return String.format("NumberPair [firstNumber=%.2f, secondNumber=%.2f]", this.getFirstNumber(), this.getSecondNumber());
	}
	
	public static void main(String[] args) {
		System.out.println("Begin Testing");
		NumberPair np1 = new NumberPair();
		System.out.println(np1);
		NumberPair np2 = new NumberPair(2.3, 4.5);
		
		// Test instance methods
		double result = np2.calcSum();
		System.out.printf("The sum of the values in np2 was %f\n", result);
		System.out.printf("The difference of the values in np2 was %,f\n", np2.calcDifference());
		
		result = np1.calcSum();
		System.out.printf("The sum of the values in np1 was %f\n", result);
		System.out.printf("The difference of the values in np1 was %,f\n", np1.calcDifference());
	}
}
