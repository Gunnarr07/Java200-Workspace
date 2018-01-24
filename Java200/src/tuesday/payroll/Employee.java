package tuesday.payroll;

/**
 * 
 * @author student
 *
 */
public class Employee {
	private int id;
	private String name;
	private String payGrade;
	private double hoursWorked;
	
	public Employee() {
		this(0, "Mr. Employee", "A1", 40);
	}
	
	public Employee(int id, String name, String payGrade, double hoursWorked) {
		this.id = id;
		this.name = name;
		this.payGrade = payGrade;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public String toString() {
		return String.format("Employee[id=%d, name=%s, "
				+ "payGrade=%s, hoursWorked=%.2f]\n", 
				this.id, this.name, this.payGrade, this.hoursWorked);
	}

	/**
	 * Find Employee by its Id
	 * @param id
	 * @return The Employee matching the id given.
	 */
	public static Employee findById(int id) {
		// Get data from db, create object
		return new Employee(id, "Jeremy", "A2", 80);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPayGrade() {
		return payGrade;
	}

	public void setPayGrade(String payGrade) {
		this.payGrade = payGrade;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}
