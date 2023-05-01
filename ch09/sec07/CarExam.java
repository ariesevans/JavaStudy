package ch09.sec07;

public class CarExam {

	public static void main(String[] args) {
		Car car=new Car();
		car.run1();
		car.run2();
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 타이거 객체3이 굴러 갑니다");
			}
		});	

	}

}
