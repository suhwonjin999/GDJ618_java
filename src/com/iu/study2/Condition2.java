package com.iu.study2;

public class Condition2 {
	public static void main(String[] args) {
		//Git Test
		// study1에서 작성함
		/* 단일 IF문 : 두개 중 하나를 선택
		 * IF - ELSE 문
		    IF(조건식){
		   		조건식이 true일 때 실행
		   	}
		   	ELSE{
		   		조건식이 false일 때 실행
		   	}
		 */
		double avg1 = 72.3;
		
		if(avg1>=60){
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		System.out.println("=======================");
		
		/* 다중선택 : 여러개 중 하나를 선택 
		 * IF - ELSE 문
	    IF(조건식){
	   		조건식이 true일 때 실행
	   	}
	   	ELSE{
	   		조건식이 false일 때 실행
	   	}
	 */
		
		double avg2 = 72.3;
		
		if(avg2>=90) {
			System.out.println("A");
		}
		else if(avg2>=80) {
			System.out.println("B");
		}
		else if(avg2>=70) {
			System.out.println("C");
		}
		else if(avg2>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		
		
	}
}
