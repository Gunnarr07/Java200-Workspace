package firday;

public class Assertions {
	
	public void nothing() {
		assert true : "You shouldn't be here!";
	}
	
	public static void main(String[] args) {
		assert args.length == 0 : "No args are permitted";
		
		if (args.length == 0) {
			return;
		}
		
		int x;
		x = 3;
		
		System.out.println(x);
		
		assert x == 5 : "Value of x is not 5";
	}
}
