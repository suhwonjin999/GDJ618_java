package com.iu.study3;

import java.util.Scanner;

public class Array2_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 한번 선언된 배열의 크기는 변함이 없다. 
		
		int count = sc.nextInt();
		
		System.out.println("배열의 크기를 입력하세요");
		int [] nums = new int[count];
		
		for(int i=0;i<count;i++) {
			System.out.println(i+1+" 번째 숫자 입력");
			nums[i] = sc.nextInt();
		}
		
		for(int i=0;i<count;i++) {
			System.out.println("인덱스 위치에 집어넣은 값을 출력하세요.");
			System.out.println(nums[i]);
		}
		
	}

}
