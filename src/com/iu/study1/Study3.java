package com.iu.study1;

public class Study3 {
	
	public static void main(String [] args){
		/*
		 * 전체 프로그램 중 main 메서드는 하나만 있으면 된다. 
		   프로그램을 실행하기 위한 목적 : main 메서드
		 
		 * 국어 점수를 담을 변수 선언
		   영어 점수를 담을 변수 선언
		   수학 점수를 담을 변수 선언
		   처음 선언한 변수 값을 대입하는 것 : 초기화
		 */
		int kor = 0;
		int eng = 0;
		int math = 0;
//		총점을 담을 변수 선언
		int total = kor+eng+math;
		
//		소수점이 있는 평균을 담을 변수 초기화
		double avr = 0;
		
//		변수를 사용할 때 데이터 타입을 쓰지않고 변수명만 쓴다.
		kor = 37;
		eng = 30;
		math = 30;
		
		/* total 의 값이 변화시키지 않아서 0으로 출력됨
		 * 최종값을 선언한 후 값을 반영하려면 총점도 다시 한번 선언되어야 함.
		 * 연산은 같은 타입끼리만 연산이 된다.
		*/
		
		total = kor+eng+math;
		avr = total/3;
				
		System.out.println("총점: "+total);
		System.out.println("평균: "+avr);
		
		/* 형변환(Cascading) 형식:
		 * 변수A = (변환할 데이터타입) 변수B;
		 * byte 크기보다 표현할 수 있는 숫자 조합이 몇 개인가에 따라 크다 작다로 나뉨
		 * float 는 근사치를 제공하기 때문에 byte 크기가 long 타입이 더 클지라도
		   표현할 수 있는 범위가 더 넓기 때문에 float 크기가 더 큰 것으로 인식함.
		 */
//		자동형변환(묵시적 형변환)
		avr = (double)kor;
		avr = kor;
		
//		강제형변환(명시적 형변환)
		eng = (int)avr;
		
		long nl = 0L;  // 8byte
		float f1 = 0.0F;  // 4byte

		
	}

}
