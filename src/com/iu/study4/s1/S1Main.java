package com.iu.study4.s1;

public class S1Main {

	public static void main(String[] args) {
		
		// void : 리턴하려고 하는 데이터 타입. (리턴할게 없음. 메서드 실행하고 종료할것이다)
		// 객체 생성 코드는 변수 선언 코드와 동일하다.
		// hap : 참조변수
		Hap hap = new Hap();
		
		//hap.h1(10, 20);
		int sum = hap.h1(10, 20);
		
		/* 두개를 더한 값에 곱하기 2를 하여라.
		 * main 메서드에서 실행
		 * h1 메서드의 결과값에 2를 곱하여하여 실행한다.
		*/
		System.out.println(sum*2);
		System.out.println("===========");
		
		// h2 리턴받은 결과 출력함
		// hap라는 참조변수에 가면 h2메서드가 있는데 어떤 숫자를 넣으면 true인지 false인지 반환됨.
		boolean check = hap.h2(21);
		System.out.println(check);
		
		System.out.println("===========");
		// h3 메서드를 호출했을 때 결과물은 length로 출력하여라. 
		// hap이라는 참조변수에 가면 h3 메서드를 int []형인 ar변수에 넣어 대입한다.
		// h3메서드는 몇개의 배열로 생성하는 값을 반환함.
		// 매개변수 : 몇 개의 배열을 만들것인가 임의로 넣을 수 있다. 
		int [] ar = hap.h3(4);
		
		// 몇 개인 배열이 생성되었는지 출력
		System.out.println(ar.length);
		
	}

}
