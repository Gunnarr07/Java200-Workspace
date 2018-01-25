package thursday;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			ints.add(i);
		}
		System.out.println(ints);
		
		// Somewhat like a for-each loop
		Iterator<Integer> it = ints.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
