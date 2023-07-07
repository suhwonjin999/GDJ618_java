package com.iu.study5;

public class SoldierMain {

	public static void main(String[] args) {
		
		/* 실행 순서
		 * SoldierMain 가장 먼저 실행됨 =>Soldier 클래스 내 attack 메서드 실행 => 
		   Rifle 클래스 내 shoot1 메서드 실행됨.
		   
		 * RifleMain 메서드와 따로 동작함!  
		*/
		
		// 실제 데이터가 들어있는 공간을 가리키는 주소 : soldier 변수 
		// 참조변수(레퍼런스 변수)
		Soldier soldier = new Soldier();
		
		// 이만큼 총이 나감.
		// Main에 있는 값을 Rifle 쪽으로 보내려 한다면 어떻게 보내야할까?
		int b = 10;
		
		//인자값 : 매개변수로 전달하는 값 
		soldier.attack(10); 

	}

}
