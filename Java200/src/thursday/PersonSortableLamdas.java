package thursday;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class PersonSortableLamdas {
	
	public void sameLastName() {
		Person[] people = {
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
		
		Arrays.sort(people);
		System.out.println(Arrays.toString(people) + "\n");
		
		// Sort with a lambda asc
		System.out.println("Lambda first name ASC");
		Arrays.sort(people, (p1, p2) -> p1.getNameFirst().compareTo(p2.getNameFirst()));
		System.out.println(Arrays.toString(people) + "\n");
		
		
		System.out.println("Lambda first name DESC");
		Arrays.sort(people, (p1, p2) -> p2.getNameFirst().compareTo(p1.getNameFirst()));
		System.out.println(Arrays.toString(people) + "\n");
		
		System.out.println("Lambda first name length");
		Arrays.sort(people, (p1, p2) -> p2.getNameFirst().length() - p1.getNameFirst().length());
		System.out.println(Arrays.toString(people) + "\n");
		
		System.out.println("Lambda first/last name ASC");
		Arrays.sort(people, (p1, p2) -> {
			int result = p1.getNameLast().compareTo(p2.getNameLast());
			if (result == 0 ) {
				result = p1.getNameFirst().compareTo(p2.getNameFirst());
			}
			return result;
		});
		System.out.println(Arrays.toString(people) + "\n");
	}
	
	public void differentName() {
		Person[] people = {
				new PersonSortable("Jeremy", "Taylor"),
				new PersonSortable("Andrew", "Estes"),
				new PersonSortable("Bryan", "Morby"),
				new PersonSortable("Momma", "Murphy"),
				new PersonSortable("Jane", "Doe"),
				new PersonSortable("John", "Doe"),
				new PersonSortable("Bruce", "Wayne"),
				new PersonSortable("Cat", "Woman"),
				new PersonSortable("Doug", "Hoff")
			};
		
		Arrays.sort(people);
		System.out.println(Arrays.toString(people) + "\n");
		
		// Sort with a lambda asc
		System.out.println("Lambda last name ASC");
		Arrays.sort(people, (p1, p2) -> p1.getNameLast().compareTo(p2.getNameLast()));
		System.out.println(Arrays.toString(people) + "\n");
		
		
		System.out.println("Lambda last name DESC");
		Arrays.sort(people, (p1, p2) -> p2.getNameLast().compareTo(p1.getNameLast()));
		System.out.println(Arrays.toString(people) + "\n");
		
		System.out.println("Lambda last name length");
		Arrays.sort(people, (p1, p2) -> p2.getNameLast().length() - p1.getNameFirst().length());
		System.out.println(Arrays.toString(people) + "\n");
		
		System.out.println("Lambda first/last name ASC");
		Arrays.sort(people, (p1, p2) -> {
			int result = p1.getNameLast().compareTo(p2.getNameLast());
			if (result == 0 ) {
				result = p1.getNameFirst().compareTo(p2.getNameFirst());
			}
			return result;
		});
		System.out.println(Arrays.toString(people) + "\n");
	}
	
	public void randomSort() {
		Person[] people = {
				new PersonSortable("Jeremy", "Taylor"),
				new PersonSortable("Andrew", "Estes"),
				new PersonSortable("Bryan", "Morby"),
				new PersonSortable("Momma", "Murphy"),
				new PersonSortable("Jane", "Doe"),
				new PersonSortable("John", "Doe"),
				new PersonSortable("Bruce", "Wayne"),
				new PersonSortable("Cat", "Woman"),
				new PersonSortable("Doug", "Hoff")
			};
		
		System.out.println("Lambda random sort");
		
		Arrays.sort(people, (p1, p2) -> {
			Random generator = new Random();
			return generator.nextInt(3) - 1;
		});
		
		System.out.println(Arrays.toString(people) + "\n");
	}
		
	public static void main(String[] args) {
		PersonSortableLamdas psl = new PersonSortableLamdas();
		
		Person[] people = {
				new PersonSortable("Jeremy", "Taylor"),
				new PersonSortable("Andrew", "Estes"),
				new PersonSortable("Bryan", "Morby"),
				new PersonSortable("Momma", "Murphy"),
				new PersonSortable("Jane", "Doe"),
				new PersonSortable("John", "Doe"),
				new PersonSortable("Bruce", "Wayne"),
				new PersonSortable("Cat", "Woman"),
				new PersonSortable("Doug", "Hoff")
		};
		System.out.println(Arrays.toString(people) + "\n");
		Arrays.sort(people);
		
		psl.differentName();
		psl.sameLastName();
		psl.randomSort();
	}
}
