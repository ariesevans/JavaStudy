package ch00.sec03;

public class Test11 {

	public static void main(String[] args) {
		
		String a ="abc";
		String b = new String ("aabc");
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

	}

}
