package monday;

import java.util.Calendar;

public class PrintFFormat {
	public static void main(String[] args) {
		System.out.printf("%s  %.4f   %,d", "a string", 2.0/3, 12345);
		Calendar c = Calendar.getInstance( );
		System.out.printf("\n%tr \n%tc \n%tl:%tM" , c, c, c, c);
	}
}