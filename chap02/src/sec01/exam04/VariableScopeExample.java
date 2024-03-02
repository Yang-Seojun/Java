package sec01.exam04;

public class VariableScopeExample {
	public static void main(String[] args){
		int v1 = 15;
		int v2 = 0;
		
		if(v1 > 10) {
			v2 = v1 - 10;
		}
		
		/*if(v1 > 10) {
			int v2;
			v2 = v1 -10;
		}*/
		//자바에서는 변수는 선언된 블록 내에서만 유효하기 때문에 오류가 발생한다
		
		int v3 = v1 + v2 + 5;
		
		System.out.println(v3);
	}
}
