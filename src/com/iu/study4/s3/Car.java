package com.iu.study4.s3;

public class Car {
	
	// 멤버변수 선언
	// 멤버변수에도 선언 시 접근지정자가 필요하다.
	// 접근지정자 기본값 : default (생략 가능하다) 
	String company;  // 자동차 제조회사 // default : 모든 객체에 공통적으로 들어감. 
	String brand;   // 자동차 브랜드 
	String color;  // 자동차 색깔
	int price;
	
	/* 생성자(Constructor): 그외지정자와 리턴타입이 없다. (리턴 자체가 없음)
	 * 생성자(메서드) 선언 : 접근지정자 클래스명과 동일한 이름을 가진 메서드명(매개변수){}
	 * 클래스 내 생성자가 없으면, 컴파일러가 기본 생성자를 만들어줌. 
	 * 기본생성자(빈 생성자) : 매개변수가 없는 생성자.
	 * 객체를 빈(Bean)이라 부름.
	 * 생성자 : 멤버변수의 값을 초기화할 때 많이 사용한다.
	 * 생성자는 기본값이 null일 때 초기값을 설정할 때 사용한다.
	 * 생성자는 클래스 내 1개 이상 있어야 함.
	 * 개발자가 하나 이상의 생성자를 선언하면 컴파일러가 자동생성하지 않는다.
	 * this로 인해 생성자에서 또 다른 생성자를 호출하는 것이 가능하다.
	 * this() : 생성자 내에서 또 다른 생성자를 호출할 때 사용함.
	*/
	// 기본생성자 : 매개변수가 없음.
	public Car() {
		// 메서드 내에서 객체 접근할 경우 : this을 사용함
		// public Car(String brand1){} 호출함. 
		this("A7");
		System.out.println("자동차를 만듭니다.");
		
/**		//참조변수 this
		this.company="AUDI";
		//this.brand="A7";
		this.color="PINK";
		this.price=9985;
*/
	}
	
	// 생성자 오버로딩 : 동일한 이름의 메서드를 매개변수를 다르게하여 선언함.
	public Car(String brand1) {
		this(brand1, "PINK");
/**		
		System.out.println("자동차를 만듭니다.");
		this.company="AUDI";
		// 멤버변수 brand에다 매개변수 brand1을 넣는다.
		this.brand = brand1;
		this.color="PINK";
		this.price=9985;
*/
	}
	
	/* 멤버변수(인스턴스 변수) brand 선언 : 힙영역에 선언함
	 * 매개변수(지역변수) brand 선언 : 스택영역에 선언함
	 * 변수명이 동일할 뿐, 변수는 동일하지 않다. 
	*/
	public Car(String brand, String color1) {
		this(brand, color1, 9985);
/**		
		System.out.println("자동차를 만듭니다.");
		this.company="AUDI";
		this.brand = brand;
		this.color = color1;
		this.price = 9985;
*/
	}
	
	public Car(String brand, String color1,int price){
		System.out.println("자동차를 만듭니다.");
		this.company="AUDI";
		this.brand = brand;
		this.color = color1;
		this.price = price;		
	}

	
	// 자동차의 정보 호출
	public void info() {
		System.out.println("Company : "+ this.company);
		System.out.println("Brand : "+ this.brand);
		System.out.println("Color : "+ this.color);
		System.out.println("Price : "+ this.price+"만원");
		
	}
	
	

}
