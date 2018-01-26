package firday;

import java.awt.GraphicsEnvironment;
import java.util.Arrays;
import java.util.List;

public class SystemFontNames {
	public static List<String> fontsList;
	public static String[] fontsArray;
	static {
		fontsArray = GraphicsEnvironment
				.getLocalGraphicsEnvironment()
				.getAvailableFontFamilyNames();
		fontsList = Arrays.asList(fontsArray);
	}
	
	public static void main(String[] args) {
		System.out.println(fontsList.size() + " fonts.");
		System.out.println(fontsList.getClass().toString());
		System.out.println(fontsList);
		System.out.println("----array");
		
		System.out.println(Arrays.toString(fontsArray));
	}
}
