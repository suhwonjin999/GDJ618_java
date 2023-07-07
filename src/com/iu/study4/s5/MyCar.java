package com.iu.study4.s5;

public class MyCar {
	
	// 클래스 멤버변수 선언
	public static String company="Kia";
	
	// 인스턴스 멤버변수 선언
	public String brand;
	
	// 클래스 변수 초기화
	static {
		MyCar.company = "AUDI";
	}
	
	// 인스턴스 변수 초기화 
	public MyCar() {
		
	}
	
	/* 클래스 변수 초기화하는 방법 2가지 
	   1) 변수 선언시 초기화 : 직접 대입하는 방식
	   2) static 블럭을 이용하는 방식
	   
	 * 인스턴스 변수 초기화 하는 방법 5가지   
	 * { } : 인스턴스 블럭 : 객체 생성시 사용함
	 * public MyCar(){}  // 객체 생성 시 사용함
	 * setter  : 객체 생성 후 
	 * 멤버변수를 초기화 하는 방법:
	1) 멤버변수 선언과 동시에 값을 넣어 초기화함
	2) 인스턴스 초기화 블럭 (instance block) : 객체생성 시 실행됨
	3) 생성자를 이용하는 방식 : 객체생성 시 실행됨
	4) 객체 생성 후 멤버변수에 값을 대입하는 방법으로 참조변수 접근함 : 참조변수명.멤버변수명 
	5) Getter / Setter 메서드 활용 : 객체 생성 후 호출할 수 있다. 
	   (인스턴트 메서드) 
	 **/

}
