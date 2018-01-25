package thursday;

public class ExceptionTest {
	public static void main(String[] args) {
		doExceptionTest(args);
		System.out.println("Program ends.");
	}

	private static void doExceptionTest(String[] args) {
		try {
			createException(args);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array not big enough!");
			System.err.println(e.getMessage());
			System.err.println(e.getCause());
			System.err.println(e.getSuppressed());
			System.err.println(e);
		} catch (Exception e) {
			System.err.println("Don't know what happened!");
		}
	}

	private static void createException(String[] args) {
		System.out.println("0 = " + args[0]);
		System.out.println("1 = " + args[1]);
	}
}
