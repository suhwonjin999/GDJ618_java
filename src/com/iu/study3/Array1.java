package com.iu.study3;

public class Array1 {

	public static void main(String[] args) {
		// 배열 (Array)
		
		int num = 1;
		int num2 = 2;
		
		double d =3.12;
		
		// 변수선언 : 데이터타입 변수명
		// 모으려고 하는 데이터 타입을 사용한다.
		// 동일한 타입끼리만 배열로 묶을 수 있다.
		// 배열 표시 : []
		// 모으려고하는 데이터타입 [] 변수명 = new 모으려고하는 데이터타입;
		// nums의 데이터 타입: int[모으려고 하는 데이터개수]
		// int타입의 데이터를 모으려고하는 데이터 타입이다.
		// new int[2]; 힙 영역에다 4바이트 2개를 연속으로 붙여서 만들어주세요.
		// 데이터값이 안들어가있는 상태의 메모리 칸만 만들어줌. 
		// 메모리 간을 생성 시 초기값은 0으로 자동으로 부여됨.
		// nums : 지역변수 (스택영역에 위치함) 
		/* 스택영역에 위치한 변수는 초기화하지 않으면 에러발생함
		   (직접 값을 변수에 넣어 초기화해야 함.)
		 * 힙 영역에 위치한 변수는 초기화하지 않아도 기본적으로 자동으로 초기화되기 때문에 
		   사용이 가능하다.*/
		/** int [] nums = new int[2]; 
		    nums 는 지역변수에 해당함 = 변수명은 존재하지 않으나, 인덱스가 변수를 대체함.(인스턴스 변수)
		    힙 영역에 int 타입인 데이터 2개를 집어넣을 칸 2칸을 만들어라.
		    2칸 중 첫번째 인덱스의 칸 시작점(주소)를 지역변수인 nums에 대입한다.  
		    하나의 변수에 하나의 값과 주소만 넣을 수 있기때문에 nums에 한개의 인덱스(주소)만 대입가능함.
		*/
		int [] nums = new int[2];
		/*Heap영역에 8바아트 빈칸을 3개 만들어주세요
		  avgs : 시작점을 가리키는 주소를 의미함.
		  */
		double [] avgs = new double[3];
		char [] chs = new char[3];
		boolean [] checks = new boolean[3];
		System.out.println(num);
		// 정수를 모은 주소 출력
		System.out.println(nums);
		// nums[0] 의 메모리 위치 : Heap 영역에 위치함.
		System.out.println(nums[0]);
		System.out.println(avgs[0]);
		System.out.println(chs[0]);
		System.out.println(checks[0]);
		
		/* 배열 사용:
		   배열의 변수명[인덱스번호], index 번호는 정수타입(int)
		*/
		nums[0]=2;
		
		// 문자열 3개를 모을 배열 선언;
		String [] names = new String[3];
		// 문자열을 모은 주소 출력
		System.out.println(names);
		// null : 정해지지 않은 값, 알수 없는 값, 무한대의 값
		System.out.println(names[0]);
		
		//배열 선언방법1
		//1,2,3을 모은 배열을 만들어 놓겠다.
		int [] nums2 = {1,2,3};
		
		// 배열 선언방법2
		int nums3 [] = new int [3];
		
		// 주소를 대입함(nums2 의 시작점의 주소를 nums에 대입함.)
		nums = nums2;
		
		

	}

}
