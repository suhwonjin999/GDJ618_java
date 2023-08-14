package com.iu.study4.s5;

public class S5Main {

	public static void main(String[] args) {
		
		/* 메서드가 만들어지는 영역 : 스택영역
		 * 객체가 만들어지는 영역 : 힙영역 (new 생성자)
		 * 객체를 만들지 않으면 주소를 알 수 없다.
			그러나 static 지정자를 쓸 수 있는 이유는?
			Method (Static) 영역이 제일 먼저 실행된다.
			따로 참조 변수가 없기 때문에 클래스명으로 찾아간다.
			클래스명.변수명
		* 메서드 영역(static 영역)에 만들어지는 변수 : 클래스변수라 부른다.
		* 클래스변수 : 변수 앞에 static 지정자가 붙는 변수이다. 
		*/
		StaticTest.staticNum=20;
		
		//staticTest 객체 생성 : 클래스명.메서드명();
		// 메서드를 호출함.
		StaticTest.staticMethod();
		
		// 클래스 변수를 사용하는 방법 : 클래스명.변수명 
		// 클래스 변수 : System.out
		
		
		

	}

}
