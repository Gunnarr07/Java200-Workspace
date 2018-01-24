package wednesday;

public class HuntingDog extends Dog {
	
	public void hunt() {
		System.out.println("I'm hunting");
	}
	@Override
	public void doWhatYourTrainedToDo() {
		super.doWhatYourTrainedToDo();
		System.out.println("And I know how to hunt."); // HuntingDog
	}
	
	@Override
	public String toString() {
//		String result = super.toS
		return super.toString();
	}
	
	public static void main(String[] args) {
		HuntingDog blue = new HuntingDog();
		blue.doWhatYourTrainedToDo();
	}
}
