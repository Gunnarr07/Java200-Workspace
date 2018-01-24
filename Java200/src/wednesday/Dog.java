package wednesday;

/**
 * Dog course - fetching, hunting, tricks.
 * guide, sniff for substance.
 * @author student
 *
 */
public class Dog implements IMakeSound {
	private String name;
	private TrickTraining trickTraining; // Composition
	
	public Dog() {
		this("No name", null);
	}
	
	public Dog(String name) {
		this(name, null);
	}
	
	@Override
	public String toString() {
		return String.format("Dog[name: %s, Tricks: %s]", this.name, this.trickTraining);
	}
	
	@Override
	public void makeSound() {
		this.bark();
	}
	
	public Dog(String name, TrickTraining trickTraining) {
		this.name = name;
		this.trickTraining = trickTraining;
	}

	public void bark() {
		System.out.println("Bark");
	}
	
	public void doWhatYourTrainedToDo() {
		System.out.println("I know how to bark.");
		this.bark();
	}
	
	public static void main(String[] args) {
		Dog rover = new Dog();
		rover.doWhatYourTrainedToDo();
	}
}
