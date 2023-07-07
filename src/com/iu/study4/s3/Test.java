package com.iu.study4.s3;

public class Test {
	
	// 멤버 선언 (힙 메모리 내에서 선언함)
	int num1;
	double num2;
	
	// 오버로딩 예시 : 메서드명은 동일하나 매개변수가 다를경우 사용함. 
	// 메서드 선언 : 접근지정자 리턴타입 메서드명(매개변수 선언){}
	// public void println(매개변수 1개만 가능함){}
	
	public void hap(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void hap(int n1, float n2) {
		
		// 자동형변환되어 float 타입 따라간다.
		System.out.println(n1+n2);
	}
	
	public void hap(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
	}
	
	// 같은 지역(같은 메모리 내에서) 선언할 경우, 중복선언함.
	// 힙 메모리 안에서 선언한 변수명과 스택 메모리 안에서 선언된 변수명이 동일하여도 중복선언이라 부르지않음.
	// 지역변수가 인스턴스 변수보다 우선순위가 더 높다. 
	public void hap(int n) {
		
		System.out.println(this.num1+n);

	}
	
	//public boolean same(int n1, double n2)
	// Test Class 안에 들어있는 정보를 달라.
	public boolean same(Test ts) {
		/* num1과 다른 객체의 num1이 같고, 
		 * num2과 다른 객체의 num2이 같으면,
		 * true 리턴, 아니면 false 리턴하자. 
		*/
		boolean result = false;
		
		// test2에 있는 num1 
		if(this.num1==ts.num1 && this.num2==ts.num2) {
			result = true;
		}
		
		// result 에 들어있는 값이 true이면 그 값을 호출하자.
		return result;
	}
	
	// 멤버 메서드 내에서 멤버 변수끼리 더한 값을 출력하고자 한다.
	public void method1() {
		
		// 객체.변수.메서드명() : System.out.println()  
		//객체 생성과 동시에 참조변수 선언함. 
		// 멤버변수 선언 : 참조변수명.멤버변수명
		// this : 참조변수를 가리킴 (생략가능) 
		// System.out.println(this.num1 + this.num2);
		// 해당 객체 안에서만 쓸 수 있다. : this 변수
		// 객체 생성과 동시에 주소가 생성되고, this 참조변수도 만들어진다.
		// method1메서드를 호출하기 위해 먼저 객체부터 생성해야 함.
		// 언제 method1메서드를 호출할 수 있나? 객체를 만들고 난 후 메서드를 호출할 수 있다.
		System.out.println(num1 + num2);	
		System.out.println(this);
		this.method2();  // this는 생략이 가능하다. 자기 자신 안에있는 것을 호출함.
		
	}

	
	public void method2() {
		System.out.println("method2");
	}

}
