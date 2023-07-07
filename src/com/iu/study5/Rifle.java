package com.iu.study5;

public class Rifle {
	
	// true이면 단발, false 이면 점사
	boolean mod;  
	
	/* 메서드 선언 공식
	 * 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언]){실행코드}
	 * public  static  void  name(String[] args){실행코드}
	 * pubilc : 접근지정자 
	 * void   : 리턴타입
	 * 메서드명 첫글자는 소문자로 시작한다.
	 * [그외지정자] 및 [매개변수 선언]은 생략이 가능하다.
	 * */
	
	// 매개변수 선언 : (int count)메서드 안에 선언된 변수 (매개변수)
	public void shoot1(int count) {
		// shoot1 메서드 안에서 선언된 변수는 Main 변수에서 쓸 수 없다.
		// 지역변수는 해당 영역이 종료되면 메모리에서 삭제되기(사라지기) 때문이다.
		int damage = 20;
		for(int i=0;i<count;i++) {
			System.out.println("탕");
		}
		count=10;
	}
	
	//shoot2번이라는 메서드명으로 생성
	// 매개변수 선언 : 값 여러개 선언해도 상관없다.
	// shoot2를 호출할 때 값을 선언된 순서대로 보내준다. 
	public void shoot2(int c, String n, int[] ar) {
		System.out.println("타타탕");
	}
	  

}
