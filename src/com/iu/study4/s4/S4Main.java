package com.iu.study4.s4;

import com.iu.study4.s3.Car;

public class S4Main {

	public static void main(String[] args) {

		// 다른 패키지 안에 있는 클래스 이용함
		Car car = new Car();
		
		// 접근 지정자가 public이라서 사용할 수 있다.
		car.info();
		
		// 멤버들의 접근지정자가 default 라서 쓸 수 없다. 
//		System.out.println(car.brand);
		
		System.out.println("==========");
		
//		Product product = new Product("사탕",1000);
		Product product = new Product();
		product.info();
//		product.name="";

		
		Students st = new Students();
		com.iu.study4.s2.Student student = new com.iu.study4.s2.Student();
		

	}

}
