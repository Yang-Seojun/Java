package scc02.exam11;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int scoer = 90;
		char grade = (scoer >= 90) ? 'A' : ( (scoer >= 80) ? 'B' : 'C');
		
		System.out.println(scoer + "점은" + grade + "등급입니다.");
	}
}
