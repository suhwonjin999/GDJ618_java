package com.iu.study4.s1;

public class Hap {
	
	// 매개변수 선언 : 2개의 정수 받아서 실행
	public int h1(int num1, int num2) {
		/* int : 리턴하고자 하는 데이터 타입 
		*/
		int sum = num1 + num2;
		System.out.println(sum);
		
		// return 리턴하고싶은 데이터;
		return sum;
	}
	
	// 리턴하고자 하는 데이터타입 변수명(매개변수){}
	// 매개변수는 무한개 쓸수 있으나, 리턴값은 한개만 반환할 수 있음.
	public boolean h2(int num) {
		
		//홀수면 true, 짝수면 false
	
		boolean result = false;
		if(num%2 !=0) {
			//result = true;
			result =! result;
		}
		
		return result;
		
	/*	for(int i=0;i<num%2;i++) {
			System.out.println(i);
		}
	*/	
		
	}
	
	// 반환하고자 하는 데이터 타입 : int [] 이다. 
	public int [] h3(int count) {
		
		// count 수만큼 정수를 담을 배열을 만들어서 리턴하여라.
		// int형 정수인 데이터를 count 개수만큼 모여 배열을 생성함.
		
		// return new int[count];  // 주소를 바로 리턴함.(빈 배열 생성)
		
		int [] ar = new int[count];
		return ar;
		
	}

}
