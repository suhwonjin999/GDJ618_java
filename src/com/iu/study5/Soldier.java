package com.iu.study5;

public class Soldier {
	
	/* 군인이 가지고 있는 요소 */
	
	String grade;  //계급 (레퍼런스 타입인 변수 선언)
	int num; 	   //군번 (primitive 타입인 변수 선언)
	//Rifle rifle;   //총기 (객체 타입인 변수 선언)
	int [] ar; 	   // 배열 타입인 변수 선언 
	
	
	// 공격
	// 매개변수 선언
	public void attack(int count) {
		Rifle rifle = new Rifle();
		rifle.shoot1(count);
		
	}

}
