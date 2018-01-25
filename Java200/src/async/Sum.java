package async;

import java.util.concurrent.Callable;

public class Sum {
	private int stop;
	
	public Sum(int v) {
		stop = v;
	}
	
	public Callable<Integer> processAsync() {
//		return new Callable<Integer>() {
//			public Integer call() throws Exception {
//				int sum = 0;
//				for(int i = 1; i <= stop; i++) {
//					sum += i;
//				}
//				return sum;
//			}
//		};
		
		Callable<Integer> callableObj = () -> {
			return processSync();
		};
		return callableObj;
	}
	
	public Integer processSync() {
		int sum = 0;
		for(int i = 1; i <= stop; i++) {
			sum += i;
		}
		return sum;
	}
}
