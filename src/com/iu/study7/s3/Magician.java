package com.iu.study7.s3;

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
	}
	
	@Override
	public void hit() {
		System.out.println("파이어볼");
	}
}
