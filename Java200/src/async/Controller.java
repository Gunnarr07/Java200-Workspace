package async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Look at page 930 for Callable examples
 * Also barrowed from Spring MVC Callable example
 * @author student
 *
 */
public class Controller {
	 public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		Sum sum = new Sum(15000);
		Hypot hypot = new Hypot(1.5, 2.5);
		Factorial factorial = new Factorial(30);
		ReadFileSystem readFS = new ReadFileSystem("C:\\Program Files (x86)");
		ReadFileSystem readFS2 = new ReadFileSystem("C:\\Program Files");
		
		Future<Integer> f;
		Future<Double> f2;
		Future<Integer> f3;
		Future<String> f4;
		Future<String> f5;
		
		System.out.println("Starting");
		
		f = es.submit(sum.process());
		f2 = es.submit(hypot.process());
		f3 = es.submit(factorial.process());
		f4 = es.submit(readFS.process());
		f5 = es.submit(readFS2.process());
		
		try {
			System.out.println(f.get());
			System.out.println(f2.get());
			System.out.println(f3.get());
			System.out.println(f4.get());
			System.out.println(f5.get());
		} catch (InterruptedException exc) {
			
		} catch (ExecutionException exc) {
			System.out.println(exc);
		}
		
		es.shutdown();
		System.out.println("Done");
	}
}
