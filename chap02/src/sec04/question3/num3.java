package sec04.question3;

import java.util.Scanner;

public class num3 {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String name, U_num, U_tel;
		
		while (true) {
		    System.out.print("1. 이름: ");
		    name = scanner.nextLine();

		    System.out.print("2. 주민번호 앞 6자리: ");
		    U_num = scanner.nextLine();

		    System.out.print("3. 전화번호: ");
		    U_tel = scanner.nextLine();

		    if (name != null && U_num != null && U_tel != null) {
		        if (U_num.length() != 6 || !U_num.matches("[0-9]+")) {
		        	/* length - 문자열을 다룰때 사용되는 메서드
		        	  matches - 문자열이 지정된 정규표현식에 일치하는지 여부를 확인*/
		        	//[0-9] 0부터9까지 +는 하나 이상의 반복이되는 것 
		            System.out.println("주민번호 형식이 올바르지 않습니다. 다시 입력해주세요.");
		            continue;
		        }

		        if (!U_tel.matches("[0-9]+")) {
		            System.out.println("전화번호 형식이 올바르지 않습니다. 다시 입력해주세요.");
		            continue;
		        }

		        break;
		    } else {
		        System.out.println("입력값을 다시 확인해주세요.");
		    }
		}
		System.out.println("종료합니다.");
	}
}
