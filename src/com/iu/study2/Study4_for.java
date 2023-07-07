package com.iu.study2;

import java.util.Scanner;

public class Study4_for {

	public static void main(String[] args) {
		
		/* FOR문 : 반복할 횟수가 정해진 경우 사용함.
		 * 선언과 동시에 초기화함; i가 5보다 작을때 까지 실행해라; 증감식 
		 * 증감식 : i를(자기자신을) 1씩 증가시켜라.
		 * i++ 은 i=i+1 식과 동일하다. (증감식)
		 * i-- 은 i=i-1 식과 동일하다. (감소식)
		 * 반복문 돌리는 횟수를 조건식과 증감식이 같이 결정한다.
		 * 조건식이 False이면 실행을 멈춰 FOR문을 빠져나간다.
		   (i가 5인 경우, 5와 같으니까 조건문 불일치 : FOR문 실행되지 않음)
		 * 만일 증감식이 없는 경우: 반복문이 무한반복으로 실행됨. 
		 * i<5; (5는 int형 상수이다)
		 * 변수 : 변하는 값이고, 상수 : 변하지 않는 값이다.
		*/
		for(int i=0;i<5;i++){
			System.out.println("Hello");			
		}
		
		
		int j=567;
		for(j=3;j>0;j=j-1){
			System.out.println("Hello");
		}
		
		System.out.println("======================");
		
		/* 키보드로부터 출력 횟수를 입력받음
		 * 입력한 횟수만큼 Hello 출력하여라.
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("횟수를 입력");
		int num = sc.nextInt();
		
		// 내가 짠 코드 : 문제는 출력안됨.
		for(num=0;num>0;num++) {
			System.out.println("Hello");
		}
		
		/*
		
		// c가 입력받은 횟수만큼 실행하여라. (방법1)
		for(int c=0; c<num; c++) {
			System.out.println("Hello");
		}
		
		// 방법 2
		for(int c=num; c>0; c--) {
			System.out.println("Hello");
		}
		
		*/

		
	}
}
