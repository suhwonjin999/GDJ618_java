package com.iu.study1;

public class Study1_ex1 {
	
	public static void main(String [] args){
		
		System.out.println("Program start");
		
		// 자기정보를 변수에 담아서 출력하기 
		// 이름, 나이, 키, 전화번호, 혈액형, 졸업학점
		
		String name = "서원진";
		int age = 33;
		double hight = 156.5;
		String phone = "010-4169-0000";
		char O = 'o';
		String blood ="AB";
		int grade = 4;
		
		System.out.println(name+"의 나이는"+age+"이고, 키는"+
		hight+"이고, 전화번호는 "+phone+"이고, 혈액형은 "+O+"형이고 졸업학점은"
		+grade+"이다.");
		
		System.out.println("프로그램 종료");
	}
}
