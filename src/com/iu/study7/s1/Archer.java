package com.iu.study7.s1;

public class Archer  extends Character{
	/**
	public void attack() {
		System.out.println("활쏘기");
	}
	*/
	
	// 오버라이딩 : 부모클래스에서 메서드를 상속받아 사용함.
	@Override
	public void attack() {
		System.out.println("활쏘기");
		
	}
	
}
