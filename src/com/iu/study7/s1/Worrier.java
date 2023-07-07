package com.iu.study7.s1;

//상속받는 문법 : 자식클래스 extends Character(부모클래스) 
//부모클래스를 상속받겠다 선언함.
// final : Worrier 클래스를 오버라이딩 하지 않는다.
// fianl과 abstract(상속) 지정자는 상반되는 개념이다.
public final class Worrier extends Character {
	
	/* 군인 캐릭터에 대한 멤버변수 선언
	*/
	//private int hp;
	//private int damage;
	//private int level;
	
	
	/**
	// 군인 공격 멤버메서드 선언
	public void attack() {
		System.out.println("칼공격");
	}
	*/	
	
	// 오버라이드한 메서드
	@Override
	public void attack() {
	/* 부모의 추상클래스 : 부모클래스에서 abstract 지정자 사용하는 클래스를 의미함.
	 * 부모의 추상클래스와 부모 객체를 참조하는 참조변수인 super는 같이 사용하지 못함.
	 * 이유 : 완성되지않은 클래스라 내용이 없기때문에 호출하지 못함. 
		super.attack(); //생략가능함. (부모의 attack 메서드를 호출하시오)
	*/
		System.out.println("칼로 공격");
	}
	

}
