package monday;

public class Dog {
	// Class Data
	public static Person vet;
	static {
		// Run code for static
		vet = new Person();
		vet.name = "Dr. Hurtz";
	}
	// Instance Data
	private String name;
	private int age;
	private Person owner; // Data composition
	
	public Dog() {
		this.name = "Rover";
		this.age = 5;
		this.owner = new Person();
	}
	
	public static void main(String[] args) {
		Dog rover = new Dog();
		System.out.println(rover.name + " is " + rover.age + " years old");
		System.out.println("I am owned by " + rover.owner.name);
		
		Dog spot, fido;
		fido = rover;
		spot = fido;
		System.out.println(spot.name + " is " + spot.age + " years old.");
		System.out.println(spot == rover);
		
		spot = new Dog();
		System.out.println("After spot becomes a new dog.");
		System.out.println(spot.name + " is " + spot.age + " years old.");
		System.out.println(spot == rover);
		
		System.out.println(spot.vet.name);
		System.out.println(fido.vet.name);
		System.out.println(Dog.vet.name);
	}
}
