package ch00.sec02;

import java.util.Scanner;

public class ScannerExample {

			public static void main(String[] args) {
			Scanner Scanner = new Scanner(System.in);
	    		
	    
			System.out.println("x값 입력");
	    
			String strX=Scanner.nextLine();

			int x=Integer.parseInt(strX);
	    
	    
	   
			System.out.println("y값 입력");
	    
			String stry=Scanner.nextLine();
	    
			int y=Integer.parseInt(stry);
	    
	  
			int result=x+y;
	    
			System.out.println("x+y'+ result");
	    
			System.out.println();
	    
	        
	  
			for (;;) { 
	    	
				System.out.println("입력 문자열");

				String strY=Scanner.nextLine();
	    
				if(strY.equals('q')) {
	    
					break;
					}
	    
				System.out.println("x+Y"+result);
	    
				System.out.println();
				}
			System.out.println("종료");
		}
	}
