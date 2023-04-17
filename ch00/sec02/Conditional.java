package ch00.sec02;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		int score = 0;
		// 값을 초기화 해주는게 좋다. 필수 입니다. 
		char grade;
		
		Scanner Scanner = new Scanner(System.in);
		
		for (;;) {
		System.out.println("점수를 입력 해주세요: ");
		String str = Scanner.nextLine();
		
		if (str.equals("q") || str.equals("Q")) {
				break;
			}
		   score = Integer.parseInt(str);
			if (score > 90) {
				grade = 'A';
			} 
			else if (score > 80) {
				grade = 'B';
			} 
			else if (score > 70) {
				grade = 'C';
			} 
			else if (score > 60) {
				grade = 'D';
			} 
			else
				grade = 'F';

			System.out.println(score + "점은" + grade + "등급입니다.");
		}
		System.out.println("종료 되었습니다.");
	}

}
