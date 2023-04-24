package ch00.sec08;

public class KoreanEam {

	public static void main(String[] args) {
		// korea 객체 생성
		Test12 k1=new Test12("박자바","01036864418");
		
		System.out.println("k1.nation:"+k1.nation);
		System.out.println("k1.name:"+k1.name);
		System.out.println("k1.ssn:"+k1.ssn);
		System.out.println();
		
		Test12 k2=new Test12("김자바","01036864418");
		
		System.out.println("k2.nation:"+k2.nation);
		System.out.println("k2.name:"+k2.name);		
		System.out.println("k2.ssn:"+k2.ssn);		
		System.out.println();
		

	}

}
