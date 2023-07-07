package com.iu.study7.s1;

// 상속받는 문법 : 자식클래스 extends Character(부모클래스) : 부모클래스를 상속받겠다 선언함.
public class Magician extends Character {
	
	/* 게임캐릭터 마법사에 대한 멤버변수 선언 
	*/
	private int mp;
	

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	// 부모 객체를 먼저 생성한 후 자식 객체를 생성한다. 
	// 부모 생성자를 받지 못하기 때문에 부모 객체를 만들지 못한다.
	public Magician(){
		super();
		// super() : 부모의 생성자 호출함 (부모의 객체를 생성함)/생략가능함. 
		// 확장 : 부모의 객체를 만들고 거기에 자신의 객체를 덧붙인다.
		/* this : 자기 자신의 객체
		   super : 부모 객체를 참조하는 참조변수이다.
		*/
		
	}
	
	/**
	// 마법사 공격 멤버메서드 선언
	public void attack() {
		System.out.println("파이어볼");
	}
	*/
	
	/* Overriding(오버라이딩) : 수저의 개념이다.
	 * 상속받은 메서드의 내용을 자기에 맞게 재정의하는 것을 의미한다.
	 * 상속받은 메서드의 선언부(메서드 헤더)는 동일하게 작성해야 한다. 
	*/
	@Override
	public void attack() {
		System.out.println("파이어볼");
	}

	
	
}


