package com.iu.study7.s3;

public final class Worrier extends Character {
	
	// has a 표현 : 가지고 있는 
	Axe axe;
	
	
	// 오버라이드한 메서드
		@Override
		public void hit() {

			System.out.println("칼로 공격");
		}

}
