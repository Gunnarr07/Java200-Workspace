package monday;

public class Tank {
	private Vehicle vehicleBehavior;
	private TrackedVehicle trackedVehicleBehavior;
	
	public Tank() {
		this.vehicleBehavior = new Vehicle();
		this.trackedVehicleBehavior = new TrackedVehicle();
	}
}
