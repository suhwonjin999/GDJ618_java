package com.iu.study4.s5;

// Class 선언부 final 쓰는 이유 : 상속불가  
public final class FinalTest {
	
	// final 지정자를 붙은 변수는 상수로 취급하기 때문에 대문자로 쓴다.
	public static final int SIZE=50;
	
	// 멤버(클래스) 변수 선언부 : 변수이지만 상수로 쓴다.
	// 상수 : 한번 입력한 값은 변경이 불가함.
	// 20으로 초기화되고 더 이상 변경할 수 없다.
	public final int NUM=20;
	public final int NUMBER;
	public final int NUMS;
	
	{	//인스턴스 블럭 이용하여 초기화함 
		this.NUMBER=20;
	}
	
	
	public FinalTest() {
		this.NUMS = 20;
	}
	
	
	// 멤버메서드 선언부 : 오버라이딩 불가 
	public final void finalMethod(){
		
		// 지역변수 선언부 fianl 사용할 수 있다.
		// 상수처럼 사용함. (한번 입력한 값은 변경이 불가하다)
		// final : 변하지않는, 마지막, 변경할 수 없는 (상수 취급하는 지정자임)
		final int A = 10;
		
	}
	

}
