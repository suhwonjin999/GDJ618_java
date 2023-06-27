package com.iu.study2;

public class Condition3 {
	public static void main(String[] args) {
		
		/* 다중선택문 
		 * switch()-case 문
		   : 연산의 결과물로 정수 하나가 도출함 (정수식 또는 문자열)
		   : 해당 케이스부터 break문까지 실행됨.
		   
		   switch(정수식 또는 문자열){
		   case
		   	break;
		   }	
		*/
		
		int num=5;
		
		switch(num*2) {
		case 10:  // 소괄호 안에 있는 숫자가 10과 같다면 찾아가라.
			System.out.println("num 10");
			break;
		case 20:
			System.out.println("num 20");
			break;
		/* defult 문이 중간에 위치해 있다면 break를 써줘야 함.
		default: 
	 		System.out.println("num 모름"); 
	 		break;
		 */
		case 30:
			System.out.println("num 30");
			break;
		default:  // 10도 아니고 20, 30도 아닌 그 외 나머지 
			System.out.println("num 모름");
		}
		
		// IF-ELSE 문
		if(num*2==10) {
			System.out.println("num 10");
		}
		else if(num*2==20){
			System.out.println("num 20");
		}
		else {
			System.out.println("num 모름");
		}				
		
	}

}
