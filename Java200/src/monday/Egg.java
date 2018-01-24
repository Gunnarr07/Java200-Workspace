package monday;

import java.util.Arrays;

public class Egg {
	
	private String size;
	private String color;
	
	@Override
	public String toString() {
		return "---EGG---";
	}
	
	public static void main(String[] args) {
		Egg[] carton = new Egg[12];
		carton[1] = new Egg();
		Egg[][] crate = new Egg[30][];
		crate[1] = carton;
		Egg[][][] truck = new Egg[96][][];
		truck[9] = crate;
		
		System.out.println(Arrays.toString(truck));
		System.out.println();
		System.out.println(Arrays.deepToString(truck));
		System.out.println();
		
		for (Egg egg : carton) {
			System.out.print((egg==null?"empty":egg) + ", ");
		}
		
		System.out.println();
	}
}
