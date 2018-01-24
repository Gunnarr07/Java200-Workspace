package wednesday;

import static wednesday.IMakeSound.*;

public class MakeSoundTest {
	private static void makeSound(IMakeSound[] soundMakers) {
		for (IMakeSound iMakeSound : soundMakers) {
			iMakeSound.makeSound();
		}
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.makeSound();
		System.out.println();
		AlarmClock ac = new AlarmClock();
		ac.makeSound();
		System.out.println();
		
		// Use Interface as superclass
		IMakeSound s1 = new Dog();
		IMakeSound s2 = new AlarmClock();
		s1.makeSound();
		System.out.println();
		IMakeSound[] soundMakers = {new Dog(), new AlarmClock()};
		makeSound(soundMakers);
		System.out.println();
		
		System.out.println(BUZZ);
		System.out.println(SOUND_OF_SILENCE);
	}
}
