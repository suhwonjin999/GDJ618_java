package com.iu.study1;

import java.util.Scanner;

public class Study4 {

	public static void main(String[] args) {
		
		/*삼항연산자 */
		// 조건식?조건식이 true 이면 실행 : 조건식이 false 이면 실행 
		int age = 5;
//		String result = age>19?"성년":"미성년";
		int result = age>19?age+3:age*2;
		
		System.out.println(result);
		System.out.println("==================");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건의 합계를 입력");
		
		int price = sc.nextInt();
		
		/* 물건의 가격이 3만원 미만이면 배송비 3000원 추가, 아니면 무료
		 * 배송비 변수 선언
		*/
		
		int del = price<30000?3000:0;
		
		// 나의 방법 : price를 형변환하지 않고 double로 선언하여 계산함.
//		price = price<30000?price-(price*0.05)+3000:price-(price*0.1);
		
		/* 물건의 가격이 3만원 미만이면 5% 할인, 아니면 10%할인, 단 배송비 제외함.
		*/
		
		// 방법1 : 계산한 결과물을 int 형변환 함.
		price = price<30000?(int)(price*0.95):(int)(price*0.9);
		// 방법2
		price = price+del;
		
		System.out.println("최종 가격: "+price);
		System.out.println("==================");
		
		//방법3
		int price1 = sc.nextInt();
		
		double sale = price1<30000?0.95:0.9;
		
		price1 = (int)(price*sale)+del;
		
		System.out.println("최종 가격: "+price1);
		
		
	}

}
