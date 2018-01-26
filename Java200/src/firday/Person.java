package firday;

public class Person {
	private String nameFirst;
	private String nameLast;
	
	public Person() {
		this("Jeremy", "Taylor");
	}
	
	public Person(String nameFirst, String nameLast) {
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", this.getNameFirst(), this.getNameLast());
	}

	public String getNameFirst() {
		return nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	public String getNameLast() {
		return nameLast;
	}

	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}
	
	public static void main(String[] args) {
		System.out.println(new Person());
		System.out.println(new Person("Bruce", "Wayne"));
	}
}
