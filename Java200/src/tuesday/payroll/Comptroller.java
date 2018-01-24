package tuesday.payroll;

public class Comptroller {
	public static void printCheckForEmployee(int i) {
		// Look up Employee by Id
		Employee foundEmployee = Employee.findById(i);
//		System.out.println(foundEmployee); // Test
		
		// Print Check for that Employee
		Check check = new Check();
		check.printForEmployee(foundEmployee);
	}
	
	public static void main(String[] args) {
		printCheckForEmployee(1);
	}
}
