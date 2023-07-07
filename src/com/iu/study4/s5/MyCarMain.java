package com.iu.study4.s5;

public class MyCarMain {

	public static void main(String[] args) {
		
		// 클래스 변수 사용(객체를 따로 생성하지 않음)
		MyCar.company = "AUDI";
		
		// 인스턴스 멤버변수 사용 (객체를 생성한 이후 사용)
		MyCar myCar = new MyCar();
		myCar.brand = "A7";

		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
		
		MyCar myCar2 = new MyCar();
		myCar2.brand = "Hyndai";

		System.out.println(MyCar.company);
		System.out.println(myCar2.brand);

	}

}
