package wednesday;

public class HuntingDog extends Dog {
	
	private String game;
	
	public HuntingDog() {
		this("Yeller", null, "ducks");
	}

	public HuntingDog(String name, TrickTraining trickTraining, String game) {
		super(name, trickTraining);
		this.game = game;
	}

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
		return String.format("HuntingDog[Dog: %s, game: %s]", super.toString(), this.game);
	}
	
	public static void main(String[] args) {
		HuntingDog blue = new HuntingDog();
		blue.doWhatYourTrainedToDo();
		System.out.println(blue);
	}
}
