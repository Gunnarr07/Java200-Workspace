package async;

import java.util.concurrent.Callable;

public class Factorial {
	private int stop;
	
	public Factorial(int v) {
		stop = v;
	}
	
	public Callable<Integer> processAsync() {
		return new Callable<Integer>() {
			public Integer call() throws Exception {
				int fact = 1;
				for(int i = 2; i <= stop; i++) {
					fact *= i;
				}
				return fact;
			}
		};
	}
	
	public Integer processSync() {
		int fact = 1;
		for(int i = 2; i <= stop; i++) {
			fact *= i;
		}
		return fact;
	}
}
