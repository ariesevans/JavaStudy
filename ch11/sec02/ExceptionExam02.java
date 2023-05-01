package ch11.sec02;

public class ExceptionExam02 {

	public static void printLength(String data) {
		try {
		int result=data.length();
		System.out.println("문자수:"+result);

	}catch(NullPointerException e) {
		System.out.println(e.getMessage());
	}finally {
		System.out.println("[마무리실행]\n");
	}
	}
		
	public static void main(String[] args) {
		System.out.println("[프로그램 시작}\n");
		printLength("ThisisJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}
