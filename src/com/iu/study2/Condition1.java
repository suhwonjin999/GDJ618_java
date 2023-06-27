package com.iu.study2;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {

		/*
		 * 단일 IF (만일 ~ 한다면)
		 * 
		 * IF(조건식) { 조건식이 true 일 때만 실행 }
		 */

		int price = 20000;

		if (price < 30000) {
			price = price + 3000;
		}

		System.out.println(price);
		System.out.println("=======================");

		int price1 = 20000;
		boolean check = false;

		if (price1 < 30000) {
			check = true;
		}

		if (check) {
			price1 = price1 * 10;
		}

		System.out.println(price1);
		System.out.println("=======================");

		int age = 20;

		// &&(앤드연산자) 이용하여 하는 방법
		if (age > 9 && age < 20) {
			System.out.println(age);
		}

		/*
		 * if문 안에 if문 이용하여 하는 방법 : 효율성이 떨어짐. if(age>9) { if(age<20) { } }
		 */

		/*
		 * Scanner 이용하여 국어, 영어, 수학 입력 총점과 평균을 계산한다. 평균이 90점 이상이면 A를 출력 평균이 80점 이상이면 B를
		 * 출력 평균이 70점 이상이면 C를 출력 평균이 60점 이상이면 D를 출력 그 외는 F를 출력
		 */
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int total = kor + eng + math;

		System.out.println("총합은: " + total);

		double avg = (double) total / 3;

		System.out.println("평균은: " + avg);
		
		/* 변수 선언은 IF문 내에 쓸 수 없다. 
		*/
//		String result="";  
		String result="F";
		int grade = 0;
		
		if (avg >= (double) 90) {
			result ="A";
			grade = (char)'A';
//			System.out.println("A");
		} else if (avg >= (double) 80 && avg < (double) 90) {
			result ="B";
			grade = (char)'B';
//			System.out.println("B");
		} else if (avg >= (double) 70 && avg < (double) 80) {
			result ="C";
			grade = (char)'C';
//			System.out.println("C");
		} else if (avg >= (double) 60 && avg < (double) 70) {
			result ="D";
			grade = (char)'D';
//			System.out.println("D");
		}
		
		/* 초기에 result 변수를 F값으로 선언하여도 조건식에 따라 값이 변함.
		 * else { 
		   result ="F"; 
		   //System.out.println("F"); 
		  }
		*/
		
		/* System.out.println() 한번만 써서 조건에 맞는 값이 출력되도록 하기
		 * 변수 활용! 
		*/
		System.out.println(grade);
		System.out.println(result);

	}
}
