package com.iu.study2;

import java.util.Scanner;

public class Study_for_ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 회원가입했을 경우 id와 패스워드 선언 및 초기화
		int id = 1234;
		int pw = 5678;
		
		/* 로그인 시도 최대 5번까지
		*/
		
		// 선생님 답안1
		// 로그인 성공 하였을 시, 다시 id 입력하세요부터 반복문 실행됨 (강제종료 해야함) 
		for(int i=0; i<5; i++) {
			System.out.println("id를 입력하세요");
			int userId = sc.nextInt();
			System.out.println("패스워드를 입력하세요");
			int userPw = sc.nextInt();
			if(userId==id && userPw ==pw) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("다시 시도하세요");
			}
		}	
		System.out.println("프로그램 종료");
		System.out.println("============================");
		
		// 선생님 답안2
		for(int i=0; i<5; i++) {
			System.out.println("id를 입력하세요");
			int userId = sc.nextInt();
			System.out.println("패스워드를 입력하세요");
			int userPw = sc.nextInt();
			if(userId==id && userPw ==pw) {
				System.out.println("로그인 성공");
				i=5;	// 로그인 성공하였을 경우 조건식이 불일치하여 for문 빠져나가게 함.
			}
			else {
				System.out.println("다시 시도하세요");
			}
		}	
		System.out.println("프로그램 종료");

		
/* FOR문 내에 5번 반복하여 입력변수 선언해주는 것이 훨씬 효율적이다.
		System.out.println("id를 입력하세요");
		int userId = sc.nextInt();
		System.out.println("패스워드를 입력하세요");
		int userPw = sc.nextInt();
*/
/*		예상 결과: else문 한번 출력되고 다시 for문 실행되어 이어서 조건문 실행
 * 		실제 결과: else문이 10번 반복되어 출력되면서 FOR문이 종료됨		
		for(int i=0; i<5; i++) {
			if(userId==id && userPw ==pw) {
				System.out.println("로그인 성공");
			}
			for(int j=0; j<5; j++) {
				if(userId!=id && userPw!=pw) {
					System.out.println("다시 로그인하세요");
				}
			}
		}
*/
	
/*		예상 결과: else문 한번 출력되고 다시 for문 실행되어 이어서 조건문 실행
 * 		실제 결과: else문이 5번 반복되어 출력되면서 FOR문이 종료됨
		for(int i=0; i<5;i++) {
		
			// 입력하는 변수 for문 내 쓰는 이유
			// 비교하는것만 반복하여 다시 시도하세요 문구가 5번 출력됨
			// 입력하는 값을 넣어 입력하는 값과 비교하여 맞으면 성공, 틀리면 다시 시도하라는 문구 출력됨
	
			if(userId==id && userPw ==pw) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("다시 시도하세요");
			}
		}
*/		
  
	}

}
