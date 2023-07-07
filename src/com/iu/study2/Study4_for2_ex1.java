package com.iu.study2;

import java.util.Scanner;

public class Study4_for2_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* FPS
		 * 1탄창에 30발이 들어가있음. 총 3탄창
		 * 총의 종류 중 하나인 M16에는 2가지 모드가 있다.
		 * 단발모드, 3점사(한번에 3발씩 나가는 것)
		 * 1번 누르면 단발로 쏘겠다. 2번누르면 점사로 쏘겠다 (모드 선택)
		 * 탕이라는 소리가 30번 나옴
		 * 타타당이라는 소리가 3번 나옴 
		 * 3개의 탄창을 다 쏠 때까지 진행함.  
		*/
		
/*	
		System.out.println("모드를 입력하세요");
		int dan = sc.nextInt();
		int bal = sc.nextInt();
 		*/
		
		/* i가 1번일 때 점사로 세 번 쏜다.
		 * j가 0번일 때 단벌로 한 번 쏜다.
		 * 실행결과 : 1 입력 후 <다다탕, 탕, 탕, 탕> 출력됨.
		*/
		/*		
		for(int i=1;i<=3;i++) {
			if(i==dan) {
				System.out.println("탕");
			}
			for(int j=0; j<30;j++) {

				if(j==bal){
					System.out.println("다다탕");
				}
			}
		}
**/
		/* 모드 입력받은 변수 선언 => 전체 FOR문 실행 
		 * FOR문 내 IF 실행
		 * IF문(입력변수가 1이면 for문실행, 2이면 for문실행) 내 FOR문 
		*/
/**		
		System.out.println("모드를 선택하세요");
		int mode = sc.nextInt();
		for(mode=0;mode<=3;mode++) {
			if(mode==1) {
				
			}
		}
*/	
/*		먼저 세번 돌아가는지 확인해보기!!!
		for(int tan=0;tan<3;tan++) {
			System.out.println("1.단발 2.점사");
			int select = sc.nextInt();
			
			// 1번 누르면 30번 반복해야함.
			// 2번 누르면 10번 반복해야함.
			if(select==1) {
				System.out.println("1111");
			}
			else {
				System.out.println("2222");
			}
		}
**/	
/*		반복횟수와 출력문을 제외한 if문 내 2개의 for문 동일함.
 * 		반복횟수 = int형 변수 생성
 * 		출력문구 = String형 변수 생성
 
		for(int tan=0;tan<3;tan++) {
			System.out.println("1.단발 2.점사");
			int select = sc.nextInt();
			
			if(select==1) {
				for(int b=0;b<30;b++) {
					System.out.println("탕");
				}
				
			}
			else {
				for(int b=0; b<10; b++) {
					System.out.println("다다탕");
				}
			}
		}
**/
		//방법 1
		for(int tan=0;tan<3;tan++) {
			System.out.println("1.단발 2.점사");
			int select = sc.nextInt();
			int count = 0;
			String sound="";
			
			if(select==1) {
				count=30;
				sound="탕";
			}
			else {
				count=10;
				sound="타타탕";
			}
			for(int b=0; b<count; b++) {
				System.out.println(sound);
			}
		}
		
		//방법 2
		for(int tan=0;tan<3;tan++) {
			System.out.println("1.단발 2.점사");
			int select = sc.nextInt();
			int count = 10;
			String sound="타타당";
			
			if(select==1) {
				count=30;
				sound="탕";
			}
			for(int b=0; b<count; b++) {
					System.out.println(sound);
				}
		}
		
	}

}
