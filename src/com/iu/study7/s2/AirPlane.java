package com.iu.study7.s2;

public class AirPlane implements Flyable{
	
	/* 오버라이딩 : 
	 * 부모 인터페이스인 Flyable에서 fly 메서드를 완성시키지 않았기 때문에 
	 * 자식 클래스인 AirPlane이 상속받아(오버라이딩 사용) fly 메서드를 완성시킴. 
	*/
	@Override
	public void fly() {
		System.out.println("하늘을 날다");
		
	}
	
	
}
