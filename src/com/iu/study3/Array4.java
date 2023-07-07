package com.iu.study3;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] nums = {1,2,3,4,5};
		
		/* 중간에 위치한 인덱스에 해당하는 데이터를 지우고자 하는 경우 
		 * {1,2,4,5} <= 4칸 배열을 생성함
		*/
		System.out.println("지울려고 하는 index 번호를 입력하세요");
		// 지우고자 하는 인덱스번호를 idx에 대입함.
		int idx = sc.nextInt();
		
		int [] copyNums = new int [nums.length-1];
		
		int index=0;
		
		for(int i=0;i<nums.length;i++) {
			if(idx==i) {
				// 빠져나와서 다시 반복문 실행함.
				continue;
			}
			
/*			else {
				for(int j=idx;j==copyNums[3];) {
					idx = nums[j];
				}
*/
			copyNums[index] = nums[i];
			index++;
			}
		
		nums = copyNums;
		
		// 코드!!
		
		
	}

}
