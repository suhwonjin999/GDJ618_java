package com.iu.study3;

public class Array6 {

	public static void main(String[] args) {
		// 배열의 특징 : 같은 데이터타입끼리만 모을 수 있다.
		double [] ar = new double [3];
		ar[0]=1.2;
		// 자동형변환 되어 배열에 넣기 가능함. ar[1]=(double)3;
		ar[1]=3;
		
		/* nums1의 주소와 nums2의 주소가 다르다. 
		*/
		int [] nums1 = new int[3];
		int [] nums2 = new int[3];
		
		// nums1에 있는 값과 nums2에 있는 값이 같은가? => false
		System.out.println(nums1 == nums2);
		
		// nums2의 주소를 nums1에 대입한다.
		nums1 = nums2;
		// nums1에 있는 값과 nums2에 있는 값이 같은가? => true
		System.out.println(nums1 == nums2);
		
		/* 배열 선언 : 데이터타입 [] 변수명
		 * 배열 두칸 : {1,2}
		 * 배열 두칸 : {{1,2},{3,4}}
		 * 배열을 꺼내면 2칸짜리 배칸이 나옴.
		*/
		// 배열을 배열에 담아 선언함. (중첩배열)
		int [][] ars = new int[2][3];
		
		int[][] ays = {{1,2},{3,4}};
		// ays[1][1]
		
		// 가변배열 : 쓰기 전 항상 선언하고 사용해야 함.
		ars = new int [2][];
		ars[0] = new int[3];  //0,1,2
		ars[1] = new int[6];  //0,1,2,3,4,5
		//{{0,0,0},{0,0,0,0,0,0}}
		
		// 안에 있는 값을 꺼내쓰려면 어떻게 해야할까?
		// 이중FOR문 써야함.
		
		for(int i=0;i<ars.length;i++) {
			for(int j=0;j<ars[i].length;j++) {
				System.out.println(ars[i][j]);
			}
		}
		
	}

}
