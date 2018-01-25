package thursday;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
	public static void main(String[] args) {
		Collection<String> strings = new ArrayList<String>();
		strings.add("dog");
		strings.add("cat");
		strings.add("dog");
		strings.remove("cat");
		strings.remove("zebra");
		System.out.println(strings);
		
		Collection<Person> people = new ArrayList<Person>();
		people.add(new Person("Jeremy", "Taylor"));
		System.out.println(people);
	}
}
