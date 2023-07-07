package com.iu.study4.s2;

public class Chef {
	
	String name;
	
	public void makeRamen2(Ramen [] ramens2) {
		
		// ramens2의 길이보다 작을 때까지 라면 객체 생성함
		for(int i=0; i<ramens2.length;i++) {
			Ramen ramen2 = new Ramen();
			ramens2[i] = ramen2;
			ramen2.title = "진라면";
			ramen2.price = 3000;			
		}
	
	}
	
	
	// 라면만들기 (main 메서드에서 호출할 때 매개변수를 통해 알려줘) 
	public Ramen [] makeRamen(int count) {
		
		/**
		// 라면 객체 생성 : 클래스명(데이터타입) 참조변수명 = new 생성자();
		Ramen ramen = new Ramen();
		Ramen ramen2 = new Ramen();
		
//		ramen2 = ramen;
		// 선언된 변수에 새로운 객체 생성됨.
		ramen2 = new Ramen();
		*/
		
		// Reference 타입의 초기값 : null
		// 배열 선언 : 라면을 count 수 만큼 모으려고 함 --> 라면을 담는 공간만 생성됨
		Ramen [] ramens = new Ramen[count];
		
		// i가 count보다 작을때까지 1씩 증가시키면서 라면을 생성한다.
		for(int i=0; i<count; i++) {
			
			Ramen ramen = new Ramen();
			ramens[i] = ramen;
			
			ramen.title = "진라면";
			ramen.price=3000;
			
			System.out.println(ramens[i]); //주소 출력
			System.out.println(ramen); // 주소출력
			
		}
		
		count = 50;
		
		//Ramen r1 = new Ramen();
		
		// 리턴하는 데이터의 개수는 한개다.
		return ramens; 
		
	}
	
	// 김밥만들기 
	public void makeKimbab() {
		
		
	}

}
