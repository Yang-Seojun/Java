package sec02.exam04;

public class ArithmeticOperatorExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int v1 = 5 ;
		int v2 = 2;
		
		int reslut1 = v1 + v2;
		System.out.println("result1 = " + v1 + v2);
		
		int result2 = v1 - v2;
		System.out.println("result2 = " + v1 + v2);
		
		int result3 = v1 * v2;
		System.out.println("result3 = " + v1 + v2);
		
		int result4 = v1 / v2;
		System.out.println("result4 = " + v1 + v2);
		
		int result5 = v1 % v2;
		System.out.println("reuslt5 = " + v1 + v2);
		
		double result6 = (double) v1 / v2;
		System.out.println("result6 = " + result6);
	}
}