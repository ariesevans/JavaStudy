package choo.sec04;

public class Test11 {

	public static void main(String[] args) {
		
		int i=10;
		int j=2;
		char t='-';
		String pandan="";
		int result = calculator(3,4,'+');
		
		System.out.println("연산의 결과값:"+result);
		
	}
	static int calculator(int a,int b,char c) {
		switch(c) {
		case '+':
			return a+b;			
		case '-':
		    return a+b;		    
		case '*':
			return a+b;
		case '/':
			return a+b;		
		default :
			return 0;
		}
}
}