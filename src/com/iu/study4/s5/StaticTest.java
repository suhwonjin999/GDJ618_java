package com.iu.study4.s5;

public class StaticTest {
	
	// public : 누구나 접근 가능하다. (접근지정자)
	public int instanceNum;
	
	public static int staticNum;
	
	// 힙 영역 : 인스턴스메서드 (객체를 반드시 생성하고 사용해야 함)
	public void instanceMethod() {
		
		/* 객체만들때 객체의 주소를 저장한다 : this 
		*/
		StaticTest.staticNum=50;
		this.instanceNum=20;
		// static 영역에서 먼저 실행되기 때문에 staticMethod 메서드 호출이 가능하다.
		StaticTest.staticMethod();
		System.out.println("멤버메서드");
	}
	
	// static 영역 : 클래스메서드 (객체를 생성하지 않고 사용함)
	// static 영역 : 프로그램 메서드가 실행하기 전 시작되는 영역
	// 클래스 메서드 내에서 instance 변수와 instance 메서드 사용 불가함.
	public static void staticMethod() {
		// 클레스메서드에서 객체를 생성하지 않아 어떤 객체에 속하지 않기 때문에 this가 없다. 
		// staticNum 메서드 호출이 불가능하다. 
		
		// 클래스 변수를 사용하는 방법 : 클래스명.변수명 
		StaticTest.staticNum=20;
		System.out.println("클래스메서드");
	}

}
