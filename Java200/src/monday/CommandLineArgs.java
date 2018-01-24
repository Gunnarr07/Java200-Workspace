package monday;

import java.util.Arrays;

public class CommandLineArgs {
	public static void main(String[] args) {
		System.out.printf("There are %d args in args\n", args.length, "\n");
		for (String string : args) {
			System.out.print(string + ", ");
		}
		
		System.out.println("\n");
		System.out.println("---Sorted---");
		Arrays.sort(args);
		
		for (String string : args) {
			System.out.print(string + ", ");
		}
	}
}
