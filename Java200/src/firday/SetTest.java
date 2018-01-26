package firday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		// Create list
		List<String> fonts;
		fonts = new ArrayList<String>(SystemFontNames.fontsList);
		System.out.printf("List has %d fonts %n", fonts.size());
		
		// Add fonts names twice and check size
		fonts.addAll(SystemFontNames.fontsList);
		System.out.printf("List now has %d fonts %n", fonts.size());
		
		// Transfer list to set and check size
		Set<String> fontSet = new HashSet<String>(fonts);
		System.out.printf("Set has %d fonts %n", fontSet.size());
		
		// Query - select fonts with Arial in it
		for (String font : fontSet) {
			if (font.contains("Arial")) {
				System.out.println(font);
			}
		}
		
		// Select Arial fonts with lamda
		Set<String> fontSet2 = new HashSet(fontSet);
		System.out.println("\nfontSet2 before Arial Filter");
		System.out.println(fontSet2);
		fontSet2.removeIf(font -> !font.contains("Arial"));
		System.out.println("\n---fontSet2 after Arial filter---");
		System.out.println(fontSet2);
		
		// Shuffle the List and show
		Collections.shuffle(fonts);
		System.out.println("\nShuffled-----");
		System.out.println(fonts);
		
		// Put in TreeSet and show
		Set<String> orderedFonts = new TreeSet<String>(fonts);
		System.out.println("\nOrdered tree set------");
		System.out.println(orderedFonts);
	}
}
