package com.iu.study2;

import java.util.Random;

public class Study_for2 {

	public static void main(String[] args) {
		
		/* 반복문을 벗어나는 2가지 방법 : 
		   조건식이 False 이거나, break(강제종료)함.
		*/
		
		Random random = new Random();  // 무작위 수를 뽑을 때 사용함.
		
		for(int i=0; i<5; i++) {
			// 0부터 3 미만의 정수 한개를 랜덤으로 뽑아준다.(0,1,2 세가지 중 하나)
			int num = random.nextInt(3);
			
			switch(num) {
			//num이 0이라면 실행하여라.
			case 0:   
				System.out.println(num);
				i=5;   // 반복문을 벗어나기 위해 조건식을 False로 만듬.
				// switch-case문을 벗어나는 break 이지, 반복문을 벗어지는 break는 아니다.
				break;  
			case 1:
				System.out.println(num);
				i=5;
				break;
			default:
				System.out.println(num);
			}
		}
		System.out.println("프로그램 종료");

	}

}
