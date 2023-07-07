package com.iu.study4.s3;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Car car = new Car();
/*		
		car.company="AUDI";
		car.brand="A7";
		car.color="PINK";
		car.price = 9985;
*/		
		// car 객체에 들어가서 자동차 정보를 호출하라.
		car.info();
		
		Car car2 = new Car("S8");
		car2.info();
		
		Car car3 = new Car("SL2", "BLACK");
		car3.info();
		
		Car car4 = new Car("SL3", "BLUE", 30000);
		car4.info();
		
		

	}

}
