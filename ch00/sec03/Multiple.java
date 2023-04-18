package ch00.sec03;

public class Multiple {

	public static void main(String[] args) {

		for(int k=0;k<2;k++) {
			for(int j=1; j<=9 ; j++) {
				for(int i=2+(k*4); i<=6+(k*4); i++) {
					System.out.print(i+" x "+j+" = "+ String.format("%2d", i*j) + "   ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}