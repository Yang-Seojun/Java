package sec02.exam04;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			i++;
			sum += i;
		}
		
		System.out.println("1~" + (i - 1) + "\n합 : " + sum);
	}
}
