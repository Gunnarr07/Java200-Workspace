package tuesday;

/**
 * Utility class with static methods only
 * 
 * @author student
 *
 */
public class Validators {
	public static boolean isRequiredString(String string) {
		return string.length() > 0;
	}
	
	public static boolean hasMinimumCharacters(String string, int number) {
		return string.length() >= number;
	}
	
	public static boolean greaterThan(double numberToCheck, double min) {
		return numberToCheck > min;
	}
	
	public static boolean lessThan(double numberToCheck, double max) {
		return numberToCheck < max;
	}
}
