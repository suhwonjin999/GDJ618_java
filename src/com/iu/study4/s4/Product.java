package com.iu.study4.s4;

public class Product {
	
	// private : 같은 클래스 내에서만 사용할 수 있다.
	private String name;
	private int price;

	// setPrice 메서드를 호출하여 가격을 넣어주면 된다.
	// 매개변수를 사용하여 집어넣는다.
	// 집어넣는 메서드 : set 변수명
	public void setPrice(int price) {
		// 받아온 price가 1보다 작다면
		if(price<1) {
			this.price = 1000;
		}
		this.price = price;
	}
	
	// private으로 되어있는 이 값을 꺼내사용하기 위해 제공함.
	// 매개변수 없이 return을 사용하여 꺼내온다. 
	// 꺼내쓰는 메서드 : get 변수명
	public int getPrice() {
		if(price<1) {
			// price 가격을 기본값 1000을 넣어라.
			this.price = 1000;
		}
		return this.price;
	}
	
	/**
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	*/
	
	public void info() {
		System.out.println(this.name);
	}

}
