package com.iu.study7.s4;

public class S4Main {

	public static void main(String[] args) {
		
		/* 컴퓨터 한대 객체 생성한 후 setter 이용하여 입력하기
		 * 부모 클래스를 상속받기 때문에 자식 클래스는 본인 데이터타입과 부모 데이터타입을 가진다.
		*/
		Computer computer = new Computer();
		computer.setCompany("SAMSUNG");
		computer.setModelName("Galaxy");
		computer.setCpu("i9");
		computer.setColor("WHITE");
		computer.setPrice(200000);
		computer.setPoint(20);
		
		Tv tv = new Tv();
		tv.setCompany("LG");
		tv.setModelName("Good TV");
		tv.setInch(100);
		tv.setPrice(5000000);
		tv.setPoint(50);
		
		Phone phone = new Phone();
		phone.setColor("APPLE");
		phone.setModelName("IPHONE15");
		phone.setOs("IOS");
		phone.setColor("GOLD");
		phone.setPrice(18000000);
		phone.setPoint(15);
		
		Customer winter = new Customer();
		
		// 메서드 호출
		winter.buy(tv);
		
		//3개 배열 생성
		Product [] products = new Product[3];
		products[0] = tv;
		products[1] = phone;
		products[2] = computer; 
		
		/* winter.buys(products);
		 * 메서드명을 동일하게 사용하여 각각의 기능을 출력함 (오버로딩) 
		 */
		winter.buy(products);
		
		

	}

}
