package firday;

/**
 * Check if Objects are equal based on selected fields
 * Done by overriding hashCode and equals methods
 * 
 * @author student
 *
 */
public class Person {
	private String nameFirst;
	private String nameLast;
	private String address;
	private String city;
	private String zip;
	private String ssNumber;
	public Person(String nameFirst, String nameLast, String address, String city, String zip, String ssNumber) {
		super();
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		this.address = address;
		this.city = city;
		this.zip = zip;
		this.ssNumber = ssNumber;
	}
	
	/**
	 * Override by going to Source -> Generate hashCode and equals
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameFirst == null) ? 0 : nameFirst.hashCode());
		result = prime * result + ((nameLast == null) ? 0 : nameLast.hashCode());
		result = prime * result + ((ssNumber == null) ? 0 : ssNumber.hashCode());
		return result;
	}

	/**
	 * Override by going to Source -> Generate hashCode and equals
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (nameFirst == null) {
			if (other.nameFirst != null)
				return false;
		} else if (!nameFirst.equals(other.nameFirst))
			return false;
		if (nameLast == null) {
			if (other.nameLast != null)
				return false;
		} else if (!nameLast.equals(other.nameLast))
			return false;
		if (ssNumber == null) {
			if (other.ssNumber != null)
				return false;
		} else if (!ssNumber.equals(other.ssNumber))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Jeremy", "Taylor", "123 Main", "Shawnee", "123456", "123456789");
		Person p2 = new Person("Jeremy", "Taylor", "456 Main", "Shawnee", "456789", "123456789");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.getClass() == p2.getClass());
	}
}
