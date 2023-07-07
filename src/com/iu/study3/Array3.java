package com.iu.study3;

public class Array3 {
	
	public static void main(String[] args) {
		
		/* 한번 선언된 배열의 크기는 변함이 없기 때문에 
		   nums 자체는 변경이 안됨.
		*/ 
		int [] nums = {1,2,3,4};
		
		// 배열의 길이를 구하는 변수 : length
		// length의 데이터 타입은 int 형이다.
		System.out.println(nums.length);
		
		// 프로그램이 실행중 인 상태에서 초기화를 하지 않고 중간에 새로운 데이터를 추가하기 위함.
		// 프로그램은 실행 상태에서 해야한다. (처음부터 다시 시작하는 게 아니다.)
		// 기존의 배열에서 더하기 1을 하여 총 5칸을 만든 새로운 배열을 생성함.
		// 배열 복사 : 기존의 데이터를 가져오기 위함. 
		int [] copyNums = new int [nums.length+1];
		
		// nums에 있는 값을 copyNums 인덱스 위치에 복사하기
		// nums의 0번 인덱스부터 시작하여 4번 복사해야함.
		for(int i=0;i<nums.length;i++) {
			copyNums[i]=nums[i];
		}
		
		// copyNums의 4번 인덱스에 값을 추가하기
		copyNums[nums.length]=5;
		
		// copyNums의 시작된 인덱스의 주소값을 다시 nums에 대입하여 수정하는 효과를 봄. 
		nums = copyNums;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("====================");
		
		// 현재 nums : 5칸이 있는 상태 ==> 다시 4칸으로 만들어보기
		// copyNumbers에 nums의 3개의 인덱스만 가져와서 대입한다.
		int [] copyNumbers = new int [nums.length-1];
		
		//인덱스 위치에 있는 값 복사하기
		for(int i=0;i<copyNumbers.length;i++) {
			copyNumbers[i]=nums[i];
		}
		
		// copyNumbers, copyNums 변수가 임시배열이다.
		nums = copyNumbers;
		
		
		System.out.println("추가할 번호를 입력하세요");

	}

}
