package tuesday;

import monday.Person;
import static tuesday.Validators.*;

public class Dog {
	private String name;
	private int age;
	private boolean isHungry;
	private double milesRunToday;
	private Person owner;
	
	@Override
	public String toString() {
		return String.format("Dog: name: %s, age: %d", this.getName(), this.age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (hasMinimumCharacters(name,  2)) {
			this.name = name;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (greaterThan(age, 0) && lessThan(age, 20)) {
			this.age = age;
		}
	}
	public boolean isHungry() {
		return isHungry;
	}
	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	public double getMilesRunToday() {
		return milesRunToday;
	}
	public void setMilesRunToday(double milesRunToday) {
		this.milesRunToday = milesRunToday;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("Fred");
		d.setAge(15);
		System.out.println(d);
		d.setName("A");
		d.setAge(4);
		System.out.println(d);
	}
}
