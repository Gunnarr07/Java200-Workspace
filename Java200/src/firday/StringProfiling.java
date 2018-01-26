package firday;

public class StringProfiling {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String aString = "";

		long start = System.currentTimeMillis();
		for (int i = 0; i <= 10000000; i++) { // 10,000,000
			aString = "abc";
			System.out.print((i % 100000 == 0) ? "." : "");
		} // 100,000
		long stop = System.currentTimeMillis();
		
		System.out.println("\nTime for String is: " + (stop - start));

		start = System.currentTimeMillis();
		for (int i = 0; i <= 10000000; i++) {
			aString = new String("abc");
			System.out.print((i % 100000 == 0) ? "." : "");
		}
		stop = System.currentTimeMillis();
		
		System.out.println("\nTime for new String() is: " + (stop - start));

	}
}
