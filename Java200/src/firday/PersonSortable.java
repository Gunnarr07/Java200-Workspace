package firday;

import java.util.Arrays;
import java.util.Comparator;

public class PersonSortable extends Person implements Comparable<PersonSortable> {
	
	public PersonSortable(String nameFirst, String nameLast) {
		super(nameFirst, nameLast);
	}

	@Override
	public int compareTo(PersonSortable anotherPerson) {
		// Sort by last name
		int firstLevelResult = this.getNameLast().compareTo(anotherPerson.getNameLast());
		
		// Sort by first name if last names match
		int secondLevelResult = this.getNameFirst().compareTo(anotherPerson.getNameFirst());
		
		return (firstLevelResult != 0) ? firstLevelResult : secondLevelResult;
	}

	public static void main(String[] args) {
//		System.out.println(new PersonSortable("Jeremy", "Taylor"));
//		PersonSortable[] people = {
//				new PersonSortable("Jeremy", "Taylor"),
//				new PersonSortable("Andrew", "Estes"),
//				new PersonSortable("Bryan", "Morby"),
//				new PersonSortable("Momma", "Murphy"),
//				new PersonSortable("Jane", "Doe"),
//				new PersonSortable("John", "Doe"),
//				new PersonSortable("Bruce", "Wayne"),
//				new PersonSortable("Cat", "Woman"),
//				new PersonSortable("Doug", "Hoff")
//		};
		
		PersonSortable[] people = {
				new PersonSortable("Jeremy", "Smith"),
				new PersonSortable("Andrew", "Smith"),
				new PersonSortable("Bryan", "Smith"),
				new PersonSortable("Momma", "Smith"),
				new PersonSortable("Jane", "Smith"),
				new PersonSortable("John", "Smith"),
				new PersonSortable("Bruce", "Smith"),
				new PersonSortable("Cat", "Smith"),
				new PersonSortable("Doug", "Smith")
		};
		
		System.out.println(Arrays.toString(people));
		Arrays.sort(people);
		System.out.println("----Sorted----");
		System.out.println(Arrays.toString(people));
		
		Arrays.sort(people, new FirstNamePersonComarator());
		System.out.println("----Sorted----");
		System.out.println(Arrays.toString(people));
	}
}

class FirstNamePersonComarator implements Comparator<PersonSortable> {
	@Override
	public int compare(PersonSortable p1, PersonSortable p2) {
		return p1.getNameFirst().compareTo(p2.getNameFirst());
	}
}
