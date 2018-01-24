package tuesday.payroll;

import java.util.Date;

public class Check {
	private Date printed;
	private double amount;
	private PrintLayout checkLayout;
	
	public Check() {
		this.checkLayout = PrintLayout.createCheckLayout();
		System.out.println("Check created with layout.");
	}

	/**
	 * Use check with layout
	 * Print employee amount with name
	 * and id in layout
	 * 
	 * @param foundEmployee an Employee
	 */
	public void printForEmployee(Employee foundEmployee) {
		double wage = PayRate.findHourlyWageForPayGrade(foundEmployee.getPayGrade());
		double calcAmount = wage * foundEmployee.getHoursWorked();
		this.amount = calcAmount;
		System.out.printf("Check for %s of $%f\n", foundEmployee.getName(), this.amount);
	}
}
