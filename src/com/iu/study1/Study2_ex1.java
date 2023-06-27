package com.iu.study1;

public class Study2_ex1 {
	
	public static void main(String []args){
		
		// 자동완성기능 : sysout 입력 후 Ctrl + Space키
		System.out.println("start");
		
		int n =1623;
//		1623을 100으로 나눈 나머지 값을 result 변수에 대입한다.
		int result = n%100;
		
		System.out.println("Result :" + result);
		
		/* 물건의 합계값 = value
		 * 손님이 낸 돈은 물건의 값보다 더 많거나 같다.
		 * 잔돈을 계산하여라. */
		int value = 35240;
//		int value = 22640;
		int don = 50000;
		
		int jandon = don - value;
		
		/* 변수 초기화 */
		int man = 0;   //1.476
		int chon = 0;  //14.76
		int backone = 0;  // 147.6
		int sib = 0;      // 1476.0
		
		man = jandon/10000;
		chon = (jandon/1000-10)%10;
		backone = (jandon/100-100)%10;
		sib = (jandon/10-1000)%10;
		
		
		/* 선생님 답안1 
		 * jandon = jandon - man *10000;  //4760
		 * chon = jandon/1000;
		 * 
		 * jandon = jandon - chon*1000;  //760
		 * back = jandon/100;
		*/
		
		/* 선생님 답안2 
		 * chon = (jandon%10000)/1000;
		 * back = (jandon%1000)/100;
		 * sib = (jandon%100)/10;
		*/
		
		System.out.println(jandon); //14760
		System.out.println("만원 :"+man +" 장");
		System.out.println("천원 :"+chon +" 장");
		System.out.println("백원 :"+backone +" 장");
		System.out.println("십원 :"+sib +" 장");
		
		
		
		System.out.println("Finish");
		
	}

}
