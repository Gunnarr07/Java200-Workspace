package tuesday;

import monday.Dog;
import monday.Person;

public class FinalTest {
	private final int x;
	
	private final Dog rover;
	
	public FinalTest() {
		x = 100;
		rover = new Dog();
	}
	
	public static void main(String[] args) {
		int y = 1;
		Dog spot = new Dog();
		FinalTest test = new FinalTest();
		
		// Things that do not work
//		test.x = y;
//		test.rover = spot;
		
		// Things that do work
		test.rover.vet = new Person();
	}
}
