package com.iu.study7.s3;

public class Character {

	/* 부모클래스 : 공통 멤버변수, 공통 멤버메서드 선언
	*/
	private int hp;
	private int damage;
	private int level;

	
	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}



	public int getLevel() {
		return level;
	}



	public void setLevel(int level) {
		this.level = level;
	}


	// final : 상속받더라도 오버라이딩 하지 말아라.
	public final void getItem() {
		System.out.println("아이템 줍기");
	}
	
	// 자식클래스에서 메서드명은 동일하나, 내용(공격행위)가 다름
	// abstract : 미완성된 메서드라는 의미이다. (추상메서드) 
	//public abstract void hit();
	
	public void hit() {
		
	}

}
