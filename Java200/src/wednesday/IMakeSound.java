package wednesday;

/**
 * In an Interface everything is abstract and public
 * 
 * Fields always public static final (constant)
 * @author student
 *
 */
public interface IMakeSound {
	String SOUND_OF_SILENCE = "";
	String HUM = "Hum Hum Hum Hum";
	String BUZZ = "Buz Buz Buz Buz";
	
	void makeSound();
}
