package tuesday;

public class Methods {
	public static void doSomething() {
		System.out.println("Doing something...");
	}
	
	public static void main(String[] args) {
		Methods m = new Methods();
		Methods.doSomething();
		tuesday.Methods.doSomething();
		doSomething();
	}
}
