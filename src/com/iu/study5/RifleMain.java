package com.iu.study5;

import java.util.Scanner;

public class RifleMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 클래스명 변수명 = new 클래스명();
		Rifle rifle = new Rifle();
		
		/* 멤버들 사용법
		 * 1. 멤버변수 변수명.멤버변수명
		  	  : 변수명이 가리키는 곳의 멤버변수명
		  	  
		 * 2. 멤버메서드 변수명.멤버메서드명()
		*/
		
		//메서드 호출
		//rifle.shoot1();
		//rifle.shoot2();
		
		/* 메서드가 종료되면 호출한 지점으로 되돌아온다.*/
		
		System.out.println("===========");
		System.out.println("1.단발  2.점사");
		int select = sc.nextInt();
		System.out.println("총알 수 입력");
		
		/* 값을 보낸것 뿐이지 메모리 주소(변수 b)를 보낸것뿐이다.
		 * 그렇기 때문에 입력값이 바껴도 값은 변하지 않음.
		*/
		int b = sc.nextInt();
		
		
		if(select==1) {
			
			rifle.shoot1(b);
			System.out.println(b);
			/**
			// 매개변수가 없는 경우 함수 실행 
			rifle.shoot1(); // 메서드 안에서 for문이 실행됨.
			*/
			/*
			for(int i=0; i<30; i++) {
				rifle.shoot1();
			}
			*/
		}
		else {
			rifle.shoot2(1, "매개변수2", null);
		}

	}

}
