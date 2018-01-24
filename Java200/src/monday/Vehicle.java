package monday;

public class Vehicle {
	private int passengers;
	private TrackedVehicle tv;
	
	public void move() {
		System.out.println("I am moving.");
	}
	
	public void addTrackedBehavior() {
		tv = new TrackedVehicle(); // Composed
	}
	
	public void  rollOnTrack() {
		// Test object has TV
		tv.rollOnTrack(); // Delegation
	}
	
	/**
	 * Testing
	 */
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.move();
		v.addTrackedBehavior();
		v.rollOnTrack();
	}
}
