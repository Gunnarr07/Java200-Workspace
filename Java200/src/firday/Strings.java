package firday;

public class Strings {
	public static void main(String[] args) {
		// Like a primative
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s3 == s4);
		System.out.printf("s3=%s, s4=%s%n", s3.hashCode(), s4.hashCode());
		System.out.printf("s3=%s, s4=%s%n", s3, s4);
		System.out.println(s3.equals(s4));
	}
}
