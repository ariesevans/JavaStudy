package ch00.sec03;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		char hak='F';
		int num=0, grade=0;
		String jumsu="";
		
		while(true) {
		
		System.out.println("점수를 입력(종료:Q)하세요 :");
		jumsu= Scanner.nextLine();
		
		
		if(jumsu.equals("Q"))
			break;
		
		num=Integer.parseInt(jumsu);
		
		grade = num/10;
		
		switch (grade) {	
		
		case 9:
			hak='A';
			break;
		case 8:
			hak='B';
			break;
		case 7:
			hak='C';
			break;
		case 6:
			hak='D';
			break;
		default:
			hak='F';
		}
		
		System.out.println("당신의 점수는"+jumsu+"이고 학점은"+hak+"입니다");
		
	}
		System.out.println("프로그램을 종료 합니다.");
	}
}




