package sec01.exam05;

import java.util.Scanner;

public class SwitchSrtingExample {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String position = sc.nextLine();
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		case "차장":
			System.out.println("300만원");
			break;
		default:
			System.out.println("잘못입력되었습니다.");
		}
	}
}
