package com.iu.study2;

import java.util.Scanner;

public class Study_for_ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 회원가입했을 경우 id와 패스워드 선언 및 초기화
		int id = 1234;
		int pw = 5678;
		boolean check=false;

		/* 로그인 성공 여부 판단하는 코드*/
		for(int i=0; i<5; i++) {
			System.out.println("id를 입력하세요");
			int userId = sc.nextInt();
			System.out.println("패스워드를 입력하세요");
			int userPw = sc.nextInt();
			if(userId==id && userPw ==pw) {
				System.out.println("로그인 성공");
				
				/* 로그인 성공하는 사람을 참으로 나누고, 실패한 사람 false로 구분함*/
				/* check 값이 필요한 이유는 성공한 사람만 for문이 끝난 후 코드 실행하기 위함*/
				check=!check;
				
				i=5;	// 로그인 성공하였을 경우 조건식이 불일치하여 for문 빠져나가게 함.
			}
			else {
				System.out.println("다시 시도하세요");
			}
		}
		
		// 로그인 성공 시 급여계산 출력하여라.
		// 로그인 성공한 경우에만 출력함. (실패시 출력하지 않음)
		if(check) {
			System.out.println("급여 계산");
		}
		
		System.out.println("프로그램 종료");
		System.out.println("======================");
		
		/* FOR 문에서 break를 만나면 그 즉시 종료한다.
		 * FOR 문에서 continue를 만나면 증감식으로 바로 이동한다.
		 * break를 쓰고 난 이후 i=5;를 쓰면 도달할 수 없다라고 에러남.
		 * 에러 원인 : break로 인해 강제종료되어 해당영역을 벗어났기 때문에 이어서 코드를 실행할 수 없음.
		 * 반복문을 벗어나는 방법 : 조건식이 False 이거나, break(강제종료)함.
		*/
		for(int i=0; i<5; i++) {
			System.out.println("id를 입력하세요");
			int userId = sc.nextInt();
			System.out.println("패스워드를 입력하세요");
			int userPw = sc.nextInt();
			if(userId==id && userPw ==pw) {
				System.out.println("로그인 성공");
				break;
			}
			else {
				System.out.println("다시 시도하세요");
			}
		}
		
	}

}
