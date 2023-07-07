package com.iu.study3;

import java.util.Random;

public class Array5_2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		// 정수 int를 모을 배열 5칸 선언
		int [] nums = new int[6];
		
		/* 배열에서 정렬(Order by) 해보자. 
		 * 첫번째 인덱스에 있는 값과 두번째 인덱스에 있는 값과 비교해본다.
		 * 첫번째 인덱스에 있는 값과 세번째 인덱스에 있는 값과 비교해본다.
		   => 세번째 인덱스가 첫번째 인덱스보다 작으면 자리바꿈.
		   여기에서 그치지않고 첫번째 인덱스와 네번째 인덱스와 비교한다.
		 * 두번째 인덱스도 첫번째 인덱스 비교할 때처럼 그 다음 인덱스부터 차례로 비교한다.
		 ** 배열의 장점 : 접근 속도가 빠르다 = 쉽게 꺼내 쓸 수 있다. (DB에서 배열을 가져올 때 정렬해서 꺼내쓴다.) 
		 ** 배열의 단점 : 한번 선언된 배열의 크기는 변경이 불가능하다. 
		 * 5개의 배열 : 3  7  1  6  9 가 있다.
		 * 첫번째인 경우 : 0번 인덱스와 1,2,3,4,5번 인덱스와 비교함
		 * 두번째인 경우 : 1번 인덱스와 2,3,4,5번 인덱스와 비교함
		 * 세번째인 경우 : 2번 인덱스와 3,4,5번 인덱스와 비교함
		 * 네번째인 경우 : 3번 인덱스와 4,5번 인덱스와 비교함
		 * 5번째인 경우 : 4번 인덱스와 5번 인덱스와 비교함 
		*/
		
		for(int i=0;i<5;i++) {
			// j=비교해야 할 첫번째 인덱스 번호 
			for(int j=i+1;j<6;j++) {
				if(nums[i]>nums[j]) {
					// nums의 i번째를 꺼내 임시 변수에 집어넣음.
					int tmp = nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
				}
			}
		}
		
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}

	}

}
