package tuesday.payroll;

/**
 * Contains lots of factory methods
 * for form layouts
 * 
 * @author student
 *
 */
public class PrintLayout {
	private String description;
	
	public static PrintLayout createCheckLayout() {
		PrintLayout checkLayout = new PrintLayout();
		checkLayout.description = "A check layout";
		return checkLayout;
	}
}
