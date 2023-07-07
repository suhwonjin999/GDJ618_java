package com.iu.study3;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		/*  
		*/
		int [] nums = new int[3];
		
		// nums의 0번 인덱스에 3인 값을 대입한다.
		nums[0]=3;
		nums[1]=2;
		nums[2]=1;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		/*
		 "배열의 길이가 3칸인데 해당 범위을 벗어났다" 에러발생함. 
		 인덱스 번호가 2번까지 있는데 3번이 없는데 어떻게 찾아 가는지 에러가 발생함.
		 컴파일 에러는 아는데 실행해야지 알 수 있는 에러를 예외 에러라 부름.
		 실행하였을 때 나오는 에러 : Exception (예외) 에러 
		// System.out.println(nums[3]);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// 입력한 수만큼 배열의 개수가 만들어짐.
		System.out.println("배열의 갯수를 입력하세요");
		int [] scnum = new int[sc.nextInt()];
		
		for(int j=0; j<sc.nextInt();j++) {
			System.out.println(j+1+" 번째 숫자 입력");
		}
		
		System.out.println("=====================");
		int [] numbers = new int[3];
		
		// i : index의 약자 (인덱스의 시작은 0번부터 시작함)
		for(int i=0;i<3;i++) {
			// 실제로 0번에 넣음.
			System.out.println(i+1+" 번째 숫자 입력");
			nums[i]=sc.nextInt();
		}
		
		
	}

}
