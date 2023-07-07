package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		/* while(true){
		   *이렇게 써도 되는데 빠져나올 때 break 밖에 못빠져나옴.
		   *대신 스위치-케이스 구문 사용하지 못함.
		   }
		*/
		//변수를 어떤 용도로 사용하느냐?
		//변수 check는 while문 조건식에 사용함.
		boolean check = true;
		int id = 1234;
		int pw = 5678;
		
		/* while문 사용
		 * 1번 누렀을 경우, id,pw 입력하고 로그인 성공여부 판단해야함
		 * 1번 눌렀을 때 로그인 시도 
		 * 2번 눌렀을 때 모르겠으니까 프로그램 종료
		*/
		
		while(check) {
			System.out.println("1.로그인시도 2.프로그램 종료");
			int mode = sc.nextInt();
			String str = "로그인시도";
			if(mode==1) {
				System.out.println("ID를 입력하세요");
				int userId = sc.nextInt();
				System.out.println("패스워드를 입력하세요");
				int userPw = sc.nextInt();
				// 로그인 성공 시 프로그램 종료되어 break 사용함.
				if(id==userId && pw==userPw) {
					System.out.println("로그인 성공");
					break;
				}
				else {
					System.out.println("로그인 실패");
				}
			}
			else {
				str = "프로그램 종료";
				System.out.println(str);
				break;
			}	
		}
		
		
		/* 로그인 성공했을 경우와 2번 눌렀을 때 반복문이 끝남.
		 * 질문: 로그인 성공여부를 스위치-케이스문을 사용하여 코드짜는 방법?
		*/
		// 선생님 답안
		while(check) {
			System.out.println("1.로그인시도 2.프로그램 종료");
			int mode = sc.nextInt();
			String str = "로그인시도";
			if(mode==1) {
				System.out.println("ID를 입력하세요");
				int userId = sc.nextInt();
				System.out.println("패스워드를 입력하세요");
				int userPw = sc.nextInt();
				// 로그인 성공 시 프로그램 종료되어 break 사용함.
				if(id==userId && pw==userPw) {
					System.out.println("로그인 성공");
					break;
				}
				else {
					System.out.println("로그인 실패");
				}
			}
			else {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		
	}

}
