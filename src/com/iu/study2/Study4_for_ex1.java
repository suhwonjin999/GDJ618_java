package com.iu.study2;

public class Study4_for_ex1 {

	public static void main(String[] args) {
		
		// 0-10 미만의 숫자 중 짝수 만을 출력하여라.
		// 어떤 숫자를 2로 나누었을 때 나머지가 0인 경우 => 짝수 
		// 일단 0부터 10까지 출력한 다음 어떻게 짝수가 나오는지 생각한다.
		
		int num = 10%2;  // num = 10을 2로 나눈 나머지값:0
		
		/* 예상결과 : 짝수만 출력
		 * 실제결과 : 0부터 9까지 출력됨
		for(int i=num%2; i<10;i++) {
			System.out.println(i);
		}
		*/
		
		/* 예상결과 : 짝수만 출력
		 * 실제결과 : 아무것도 출력이 안됨.
		 * i=0이고 조건식이 i가 0과 같으니까 아무것도 출력이 안됨.
		for(int i=num%2; i<10%2;i++) {
			System.out.println(i);
		}
		*/
		
		/* 0-10 미만의 숫자 중 짝수만 출력
		   단, IF문을 사용하지 않고 출력하여라.
		*/
		for(num=0; num>10%2; num++) {
			System.out.println(num);
		}

		
		System.out.println("IF문을 사용하지않은 짝수 출력 방법1");
		for(int j=0; j<10; j++) {
			System.out.println(j);
			j++;
		}
		
		
		System.out.println("================");
		System.out.println("IF문을 사용하지않은 짝수 출력 방법2");
		for(int j=0; j<10; j=j+2) {
			System.out.println(j);	
		}
		
		// 궁금한점 : IF문을 사용하지 않고 홀수만 출력하였을 때 어떻게 하는가?
		// 0부터 시작하면 짝수가 출력, 1부터 시작하면 홀수가 출력됨. (2씩 증가하여 10이 될때까지 반복하여 실행함)
		System.out.println("================");
		System.out.println("IF문을 사용하지않은 홀수 출력 방법");
		for(int j=1; j<10; j=j+2) {
			System.out.println(j);	
		}
		
		
		System.out.println("================");
		System.out.println("IF문을 사용한 짝수 출력");
		//IF문을 사용한 짝수 출력
		for(int number=0; number<10;number++) {
			// i%2 나머지가 0과 같다면 출력하라
			if(number%2==0) {
				System.out.println(number);
			}
		}
		
		System.out.println("================");
		/* a부터 z까지 출력하여라 (Char 타입) 
		 * 97~122 사이 1씩 증가하여 출력함.
		 * 타입 형변환 활용함. (아스키코드)
		*/
		System.out.println("방법1");
		for(int c=97;c<=122;c++) {
			System.out.println((char)c);
		}
		
		System.out.println("방법2");
		// 자동형변환됨
		for(int c='a';c<='z';c++) {
			System.out.println((char)c);
		}
			
	}

}
