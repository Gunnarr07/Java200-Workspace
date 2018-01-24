package wednesday;

public class DogTest {
	public static void main(String[] args) {
		Dog rover = new Dog();
		HuntingDog yeller = new HuntingDog();
		
		// Polymorphic calls
		System.out.println(rover);
		System.out.println(yeller);
		
		rover.doWhatYourTrainedToDo();
		yeller.doWhatYourTrainedToDo();
		
		// Advanced version
		Dog y = yeller;
		y.doWhatYourTrainedToDo();
	}
}
