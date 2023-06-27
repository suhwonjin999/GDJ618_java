package com.iu.study1;

public class Study3_1 {
	
//	main 쓰고 Ctrl + Space 키 
	public static void main(String[] args) {
		
		int num1 = 17;
		
		//double avg = num1/2;  // 8.0
		double avg = (double)num1/2;  //8.5
		
		/* 원칙적으로 같은 타입끼리 연산이 되지만,
		 * 정수 2가 double로 자동형변환이 된다.
		 * 숫자 2는 소수점이 없기 때문에 int 타입으로 됨.
		 * double이 int보다 크기 때문에 자동형변환됨.
		 * double avg = (double)num1/(double)2; 
		*/
		
		avg = num1/(double)2;
		
//		avg = num1/2.0;
		
		char ch = 'a';	
	/*
		메모리에 저장될 때 0과 1로 저장됨. (숫자로도 문자로도 저장됨)
		메모리에 저장된 2진수를 10진수로 변환할 수 있기 때문에 
		ch타입이 숫자로 변환될 수 있다. (아스키코드표)
	*/
		// 자동형변환
		num1 = ch;
		
		num1 = 115;
		// 강제형변환
		ch = (char)num1;
		
		ch = '1';   // 문자 '1'은 정수 49 이다.
		num1 = ch;
		
		// 문자와 숫자이기 때문에 ch가 int형 보다 더 작은 byte 타입이기 때문에
		// ch가 int형으로 자동형변환되어 숫자 연산이 된다. 
		num1 = ch +1;
		
		System.out.println(avg);
		System.out.println(num1);
		System.out.println(ch);
		
		System.out.println(1+"1");
		System.out.println(1+"1"+'1');
		
	}

}
