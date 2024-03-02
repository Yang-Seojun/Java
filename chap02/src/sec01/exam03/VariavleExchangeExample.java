package sec01.exam03;

public class VariavleExchangeExample {
	public static void main (String[] srg) {
		int x = 3; int y = 5;
		
		System.out.println("X: " + x + ", y: " + y);
		
		int temp = x;
		
		x = y;
		y = temp;
		
		System.out.println("X: " + x + ", Y: " + y);
	}
}
