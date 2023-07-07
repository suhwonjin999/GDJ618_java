package com.iu.study4.s3;

public class Phone {
	
	/* 우선순위 (실행순서)
	 * 첫번째 실행 : 멤버변수를 선언과 동시에 초기화함
	 * 두번째 실행 : 인스턴스 초기화 블럭 (instance block)
	 * 세번째 실행 : 생성자 호출(생성자에서 초기화)
	 * 네번째 실행 : 참조변수 접근 (참조변수명.멤버변수명) 객체 생성 후 멤버변수에 값을 대입함.
	 * 네번째 실행 : Getter / Setter 메서드 활용 
	 * 네번째 실행에서는 실행순서가 동일함. 보통 Getter / Setter 메서드 활용하여 많이 쓰인다.
	*/
	
	//멤버변수(인스턴스 변수) 선언과 동시에 초기화함.
	String company="APPLE";
	String brand="IPONE5";
	
	{
		// Instance 초기화 블럭 : 멤버변수에 값을 넣어 초기화함
		// this : 자기자신 객체 나타냄.
		this.company="LG";
		this.brand="가로본능";
	}

/**	
	// 생성자 호출 
	public Phone() {
		this.company="SAMSUNG";
		this.brand="S20";
	}
*/
	
	public void info() {
		System.out.println("Company: "+this.company);
		System.out.println("Brand: "+this.brand);
	
	}
	
	

}
