package com.iu.study4.s2;

public class ChefMain {

	public static void main(String[] args) {
		
		// Null 포인트 인셉션 : 객체를 사용하지 않고 사용하려 할때 사용함.(객체 생성 X)
		// 객체를 만들지 않고 사용하려 했을 경우 에러 발생함 : NullPointerException
		
		// 새로운 객체를 만드는데 힙 메모리에다 만들어 주세요 (new)
		// 주소를 리턴하여 chef라는 변수에 담아주세요.
		Chef chef = new Chef();
		
		//메서드 호출
		Ramen [] ramens = chef.makeRamen(3);
		
		System.out.println("===============");
		// 라면을 담을 공간만 만듦.
		Ramen [] ramens2 = new Ramen[2];
		chef.makeRamen2(ramens2);
		System.out.println(ramens2[0]); // 객체를 따라가는 주소값 출력
		System.out.println(ramens2[0].title);
		
		// count 안에 스텍 메모리 안에 실제 값이 들어가있음.
		int count = 2 ;
		chef.makeRamen(count);
		
		// makeRamen 메서드 안에서 생성된 객체는 메인 메서드 안에서 생성된 객체와 다르다.
		//Ramen r1 = new Ramen();
		chef.makeKimbab();
		

	}

}
