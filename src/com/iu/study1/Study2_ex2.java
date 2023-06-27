package com.iu.study1;

import java.util.Scanner;

public class Study2_ex2 {
	
	public static void main(String []args){
		
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		// 스캐너 타입(데이터타입)  (변수명)sc ;
		/* 변수 선언
		 * String name;  
		   String 타입  변수명(name);
		   
		 * String[]  args;
		   String[] 타입  변수명(args); => Reference 타입에 해당됨
		*/
		
		/**
		 * 문서작성 시 주석 (API 만들 때 주석) 
		*/
		
		/* 입력     출력
		 * 0	   05
		 * 1	   1		//1
		 * 2	   2
		 * 3 	   3
		 * 4	   10 		//6
		 * 5 	   11		//6 (1*4+2)
		 * 6	   12		//6 
		 * 8	   20		//12 
		 * 9	   21		//12
		 * 10	   22		//12
		 * 16	   40		//24
		 * 20	   50		//30
		 * 400	   1000     //600
		*/

		System.out.println("입력하세요");
		
		int input = sc.nextInt();  // 키보드로부터 정수형을 입력받겠다.
//		int output = (input/4)=몫을 구함
//		0을 4로 나눈 나머지 0
		int output = (input/4*10)+(input%4);
				
		System.out.println("Input :"+input+", Output:"+output);
		
		System.out.println("Finish");
	}

}
