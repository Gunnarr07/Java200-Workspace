package wednesday;

public class DogReferences {
	
	/**
	 * Polymorphic Method
	 * @param dogs
	 */
	public static void print(Dog[] dogs) {
		for (Dog dog : dogs) {
			System.out.println(dog);
			dog.doWhatYourTrainedToDo();
		}
	}
	
	public static void print2(Object[] dogs) {
		for (Object dog : dogs) {
			System.out.println(dog);
		}
	}
	
	public static void main(String[] args) {
		HuntingDog yeller = new HuntingDog();
//		Dog rover = new Dog("Rover");
		Dog rover = new HuntingDog("Rover", null, "");
		Object o = new Object();
		
		Dog[] dogs = {yeller, rover};
		print(dogs);
		System.out.println("\n");

		o = yeller;
		Object[] dogs2 = {yeller, rover, o};
		print2(dogs2);
		System.out.println("\n");
		
		HuntingDog hd = (HuntingDog)o;
		
		Dog[] dogs3 = {yeller, rover, hd};
		print(dogs3);
		System.out.println("\n");

	}
}
