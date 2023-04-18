package ch00.sec03;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		int count=0;
		String id="ezen";
		String pw="12345";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String put_id= scanner.nextLine();
		
		if(!put_id.equals(id))
			// 아이디 비교 하여 맞는지 확인. ! 반대 개념으로 
			{
			System.out.println("아이디가 틀렸습니다"); 
		
		}
		else { 
			while(true) {
			
		
			System.out.println("비밀번호를 입력해주세요");
			String put_pw=scanner.nextLine(); 
			if(!put_pw.equals(pw))
			{
				System.out.println("비밀번호가 틀력씁니다");
				count++;
				
			} 
			else {
				System.out.println("ok");
				break;
			}
			
			if(count==3) {
				System.out.println("꺼져");
				break;
			}		
		}
	}		
}	 
}
