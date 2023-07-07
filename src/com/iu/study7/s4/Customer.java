package com.iu.study7.s4;

public class Customer {
	
	/* 손님 구성 클래스 
	*/
	private int money;  // 손님이 가지고있는 돈 
	private int point;  // 물건 구입할때마다 받은 누적 포인트
	
	public Customer() {
		this.money = 100000000;
		this.point = 50;
	}
	
	/* 손님돈 - 물건가격 
	 * 물건가격에 대한 데이터를 받을 때 매개변수를 통해 받는다.
	 * 매개변수는 하나만 쓰고, 3개의 제품에 대한 가격 데이터를 받는다.
	 * 메서드 하나로 처리함.
	*/
	
/*	public void buy(Computer computer) {
		this.money = this.money - computer.getPrice();
		this.point = this.point + computer.getPoint();		
	}
*/	
	/* 한개의 데이터타입을 받아서 하나의 제품 구입 시 가격과 포인트를 구하는 문제.
	 * 변수명은 상관없고, 매개변수로 보내려고 하는 데이터 타입이 중요하다!
	 * Phone 객체인 경우, Phone 데이터타입이자 Product 데이터 타입이다. (상속받기 때문)
	 * Tv 객체인 경우, Tv 데이터 타입이자 Product 데이터 타입이다.
	 * Computer 객체인 경우, Computer 데이터 타입이자 Product 데이터 타입이다.
	 * public void buy(받고자 하는 데이터타입  임의지정가능한 변수명)
	 * => main 메서드에서 호출 : winter.buy(실제 데이터정보를 담은 자식객체명);
	*/
	public void buy(Product product) {
		this.money = this.money - product.getPrice();
		this.point = this.point + product.getPoint();
		// 본인이 가지고 있는 돈과 포인트 출력
		System.out.println(this.money);
		System.out.println(this.point);
	}
	
	
	/* 한개의 데이터타입을 받아서 두개 이상의 제품 구입 시 가격과 포인트를 구하는 문제.
	 * public void buys(Product [] products){}
	*/

	public void buy(Product [] products) {
		for(int i=0; i<products.length;i++) {
			// 첫번째의 buy 메서드 호출하여 products의 i번째 꺼내서 사용함.
			System.out.println(products[i]+"의 주소 출력");
			// point 데이터 변수를 꺼내올 때 get함수를 사용해야함.
			System.out.println(products[i].getPoint()+"의 가격 출력");
			this.buy(products[i]);
		}
	}
	

}
