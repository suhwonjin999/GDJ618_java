package com.iu.study7.s2;

public abstract class Animal {
	
	/* abstract 지정자 : 상속하여 사용하라. (상속 목적으로 사용함)
	 * 객체를 못만들게 강제를 준다. 
	*/
	
	// 모든 동물은 잠을 자나, 자는 방식은 동물마다 다르기 때문에 추상메서드로 선언함.
	public abstract void sleep();
	
	
}
