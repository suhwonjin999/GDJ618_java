package com.iu.study2;

public class Study_for3 {

	public static void main(String[] args) {
		
		// 주제 : 이중 FOR문을 이용한 구구단 출력
		for(int i=1; i<10; i++) {
			// 연산은 *부터 시작한 다음 +한다.
			// 3단 출력됨
			System.out.println(3+"*"+i+"="+3*i);
		}
		
		System.out.println("=====================");
		
		/* 이중 FOR문
		 * 1) 구구단이 2부터 시작한다.
		 * 2) 2가 10보다 작습니까? => 참이면 FOR문 내 FOR문 실행
		 * 3) i가 1부터 시작한다.
		 * 4) 1이 10보다 작으니까 조건문 실행.
		 * 5) i가 10과 같으니까 FOR문 내 FOR문이 종료됨
		 * 6) 구구단이 1이 올라가면서 3부터 다시 시작한다.
		*/
		for(int gugudan=2;gugudan<10;gugudan++) {
			for(int i=1; i<10; i++) {
				System.out.println(gugudan+"*"+i+"="+gugudan*i);
			}
		}
		
		System.out.println("=====================");
		
		/* 0분 0초부터 5분 59초까지 출력하여라.
		 * 분침이 한번 크게 돌때 안에서 초가 59번 작게 반복하여 돈다.
		*/
		for(int min=0;min<6;min++) {
			for(int sec=0;sec<60;sec++) {
				System.out.println(min+"분"+sec+"초");
			}
		}

	}

}
