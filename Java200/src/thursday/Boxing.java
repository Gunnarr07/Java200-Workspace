package thursday;

import java.util.ArrayList;
import java.util.List;

public class Boxing {
	public static void main(String[] args) {
		// New way
		int i = 1;
		Integer one = i;
		System.out.println(one);
		
		// Old School
		Integer two = new Integer(2);
		int i2 = Integer.valueOf(two);
		System.out.println(i2);
		System.out.println(new Integer(1) + 1);
		
		// for Byte, Short, Integer, Long
		//     Double, Float, Char, Boolean
		
		// Collections
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		System.out.println(ints);
		
	}
}
