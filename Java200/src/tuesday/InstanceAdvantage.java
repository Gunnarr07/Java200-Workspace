package tuesday;

public class InstanceAdvantage {
	private int x, y, z, a, b, c;
	
	@Override
	public String toString() {
		return String.format("InstanceAdvantage: %d %d %d %d %d %d", x, y, z, a, b, c);
	}
	
	private InstanceAdvantage() {
		x = 1;
		y = 2;
		z = 3;
		a = 4;
		b = 5;
		c = 6;
	}
	
	public static InstanceAdvantage IAFactoryHundreds() {
		InstanceAdvantage hundreds = new InstanceAdvantage();
		hundreds.x = 100;
		hundreds.y = 100;
		return hundreds;
	}
	
	public static int addStatic(int[] numbers) {
		int result = 0;
		for (int o : numbers) {
			result += o;
		}
//		return i + j + k + l + m + n;
		return result;
	}
	
	public int addInstance() {
		System.out.println(this);
		return x + y + z + a + b + c;
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		System.out.println(InstanceAdvantage.addStatic(numbers));
		InstanceAdvantage advantage = new InstanceAdvantage();
		System.out.println(advantage.addInstance());
		advantage.a = 10;
		advantage.b = 11;
		advantage.c = 12;
		System.out.println(advantage.addInstance());
	}
}
