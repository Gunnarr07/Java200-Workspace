package firday;

import java.util.Arrays;
import java.util.List;

public class ForEachLambdas {
	public static String result;
	public static List<String> letters;
	
	static {
		result = "";
		letters = Arrays.asList("a", "b", "c");
	}
	
	public static void process(String item) {
		System.out.println(result += item);
	}
	
	public static void main(String[] args) {
//		List<String> strings = Arrays.asList("a", "b", "c");
		letters.forEach((item) -> {
			System.out.println(result += item);
		});
		letters.forEach( item -> {
			System.out.println(result += item);
		});
		letters.forEach( item -> process(item));
		
	}
}
