package com.iu.study1;

public class Study2 {
	
	public static void main(String []args){
		
		System.out.println("Program 시작");
		
		int num1 = 20;
		int num2 = 50;
		
//		산숭연산자 우선 실행하고, 실행결과값을 num3에 대입하라.
		int num3 = num1+num2;
		
//		num1을 num2로 나눈 나머지 연산자
		int num4 = num1%num2;
		
//		String type + int type = String type이 됨.
//		String type + boolean type = String type이 됨.		
//		문자열을 산수를 할 수 없기 때문에 문자열로 출력된다.
		String name="1";
		String result = name+2;
		String re = name + true;
		
//		자기자신을 1씩 증가시키거나 감소시키는 역할 : 증감연산자
//		어떤 데이터가 오더라도 1씩 증가되는지 확인! (누적함수)
		int count =78;
		count = count+1;
		count++; //count = count+1; (후행)
		++count; //count = count+1; (선행)
		
		// 후행 : 대입을 먼저 한 다음 자기자신을 1씩 증가한다. (대입 우선실행됨)
		int count1 = count++;  //82
		
		//다른 연산자보다 제일 먼저 증감연산자를 우선 실행시켜라.
		int count2 = ++count;
		
		--count; // count = count-1;
		count--; // count = count-1;
		
		// count는 더하기 1한 값을 자기자신에 넣고싶은경우
		count = count+1;
		count+=1;
		
		// count는 곱하기 5한 값을 자기자신에 넣고싶은경우
		count = count*5;  // count*=5; 과 동일함.
		count*=5;  // 확장된 대입연산자
		
		// count는 3을 나눈 값을 자기자신에 넣고싶은경우
		count = count%3;
		count%=3;
		
		System.out.println("Count : "+count);
		System.out.println("Count1 : "+count1);
		System.out.println("Count2 : "+count2);
		
		System.out.println(re);
		System.out.println(result);
		System.out.println(num3+"와 "+ num4);
		
		
		System.out.println("Program 종료");
	}

}
