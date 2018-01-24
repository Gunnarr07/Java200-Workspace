package wednesday;

import tuesday.Dog;

public class ExceptionTest {
	public static void main(String[] args) {
		// Checked Exception
		System.out.println("start");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
		try {
			// RunTime (Unchecked Exception)
			System.out.println(1/0);
			
			// NullPointer Exception
			Dog d = new Dog();
			d.setOwner(null);
			System.out.println(d.getOwner().name);
		} catch (ArithmeticException ae) {
			System.err.println("Illegal aritmetic.");
			System.err.println(ae);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
