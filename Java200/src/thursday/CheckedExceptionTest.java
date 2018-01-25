package thursday;

public class CheckedExceptionTest {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			throwException();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Always ececutes.");
		}
		System.out.println("End");
	}

	private static void throwException() throws InterruptedException {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			throw(e);
		}
	}
}
