package firday;

import java.util.Comparator;

public class FirstNamePersonComparator implements Comparator<PersonSortable>{
	
	@Override
	public int compare(PersonSortable p1, PersonSortable p2) {
		return p1.getNameFirst().compareTo(p2.getNameFirst());
	}
	
	// Create A TreeSet
}
