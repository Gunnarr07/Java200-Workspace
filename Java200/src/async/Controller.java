package async;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
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
	private Sum sum = new Sum(15000);
	private Hypot hypot = new Hypot(1.5, 2.5);
	private Factorial factorial = new Factorial(30);
	private ReadFileSystem readFS = new ReadFileSystem("C:\\Program Files (x86)");
	private ReadFileSystem readFS2 = new ReadFileSystem("C:\\Program Files");
	private JsonReader jsonReader = new JsonReader();
	
	/**
	 * Asyn Controller Method
	 */
	public void asynMethod() {
//		ExecutorService es = Executors.newFixedThreadPool(5);
//		ExecutorService es = Executors.newCachedThreadPool();
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		Future<Integer> f;
		Future<Double> f2;
		Future<Integer> f3;
		Future<String> f4;
		Future<String> f5;
		Future<String> f6;
		
		System.out.println("Starting");
		Instant first = Instant.now();
		f = es.submit(sum.processAsync());
		f2 = es.submit(hypot.processAsync());
		f3 = es.submit(factorial.processAsync());
//		f4 = es.submit(readFS.processAsync());
//		f5 = es.submit(readFS2.processAsync());
//		f6 = es.submit(jsonReader.readAsync());
		
		try {
			System.out.println("Sum: " + f.get());
			System.out.println("Hypot: " + f2.get());
			System.out.println("Factorial: " + f3.get());
//			System.out.println(f4.get());
//			System.out.println(f5.get());
//			System.out.println("JsonReader: " + f6.get());
		} catch (InterruptedException exc) {
			System.err.println(exc);
		} catch (ExecutionException exc) {
			System.err.println(exc);
		}
		
		es.shutdown();
		Instant second = Instant.now();
		Duration duration = Duration.between(first,  second);
		System.out.println("Done " + duration.getSeconds());
	}
	
	public void synMethod() {
		Instant first = Instant.now();
		System.out.println(sum.processSync());
		System.out.println(hypot.processSync());
		System.out.println(factorial.processSync());
//		try {
//			System.out.println(readFS.processSync());
//			System.out.println(readFS2.processSync());
//			System.out.println(jsonReader.readSync());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		Instant second = Instant.now();
		Duration duration = Duration.between(first,  second);
		System.out.println("Done " + duration.getSeconds());
	}
	
	 public static void main(String[] args) {
		 Controller controller = new Controller();
		 controller.asynMethod();
		 controller.synMethod();
	}
}
