package com.iu.study7.s5;

public class S5Main {

	public static void main(String[] args) {
		
		/* 인터페이스는 객체를 생성하지 못하지만, 다형성으로 인해 데이터타입으로 선언함.
		 * 데이터타입 : InterfaceTest 
		 * Testimpl 클래스에서 객체를 생성하여 담은 변수를 인터페이스타입의 변수에 집어넣어 선언함.
		 * 이 두가지 과정을 하나로 합친 코드가 아래 코드이다.
		*/
		//Testimpl impl = new Testimpl();
		//InterfaceTest its = impl;
		
		InterfaceTest it = new Testimpl();
		

	}

}
