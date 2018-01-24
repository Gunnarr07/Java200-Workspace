package wednesday;

/**
 * Dog course - fetching, hunting, tricks.
 * guide, sniff for substance.
 * @author student
 *
 */
public class Dog {
	private String name;
	private TrickTraining trickTraining; // Composition
	
	public void bark() {
		System.out.println("Bark");
	}
	
	public void doWhatYourTrainedToDo() {
		System.out.println("I know how to bark.");
	}
	
	public static void main(String[] args) {
		Dog rover = new Dog();
		rover.doWhatYourTrainedToDo();
	}
}
