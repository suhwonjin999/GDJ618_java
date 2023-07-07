package com.iu.study4.s4;

import java.util.Scanner;


public class StudentsController {
	
	public void start() {
		
		/* 하나의 프린트문에 1번 누르면 생성, 2번 누르면 출력, 3번 누르면 종료하게끔 함
		 * 프로그램 종료될때 까지 실행 후 다시 메뉴로 돌아오게끔 함. 
		 * 1. 학생정보 생성 ==> makeStudents 메서드 호출  
		 * 2. 학생정보 출력 ==> StudentView에서 출력 (기본값 null 출력)
		 * 3. 프로그램 종료
		*/
		
		Scanner sc = new Scanner(System.in);
		int select =0;
		
		// 객체 생성
		// 입력할 때 StudentService, 출력할 때 StudentView
		StudentsService studentsService = new StudentsService();
		StudentsView studentsView = new StudentsView();
		
		// 배열 초기값 선언 
		Students [] students = null;
		
		while(true){
			System.out.println("1.학생정보 생성");
			System.out.println("2.학생정보 출력");
			System.out.println("3.학생정보 검색");
			System.out.println("4.학생정보 종료");
			
			select = sc.nextInt();
			
			if(select==1) {
//				System.out.println("1번 누름");
				// studentService 안의 makeStudents 메서드를 호출함
				// IF문 안에 배열 초기값이 선언하면 2번 눌렀을 때 초기값만 출력됨.
				students = studentsService.makeStudents();
			}
			else if(select==2) {
//				System.out.println("2번 누름");
				// 2번 눌렀을 때 view 메서드 호출함
				studentsView.view(students);
			}
			else if(select==3) {
				// primery key: unique, not null
				// 학생 한명 출력 : 학생 번호로 조건 검색함
				/* 1. findBynum
				 * 2. viewOne 으로 호출
				*/
//				Students student = studentsService.findByNum(students);
				// viewOne 메서드를 호출하면서 찾은 학생의 값을 보내줌.
				//studentView.viewOne(student);
//				studentsView.view(student);
				
			}
			else if(select==4) {
				System.out.println("종료합니다");
				break;
			}
			else {
				System.out.println("잘못 눌렀습니다.");
			}
		}
		
	}
}
