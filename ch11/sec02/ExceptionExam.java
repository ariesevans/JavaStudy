package ch11.sec02;

public class ExceptionExam {

	public static void printLength(String data) {
		int result=data.length();
		System.out.println("문자수:"+result);

	}
	public static void main(String[] args) {
		System.out.println("[프로그램 시작}\n");
		printLength("ThisisJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}
