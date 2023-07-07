package com.iu.study4.s2;

public class S2Main {

	public static void main(String[] args) {
		
		/* main 메서드 역할:
		   1. 프로그램 실행시킴
		   2. 테스트 용도 
		*/
		
		// StudentService 객체를 인스터화시킴.
		StudentService studService = new StudentService();
		
		//============================================/
		// 학생 한명의 정보를 출력하여라.
		// 데이터타입이 Student 이므로 선언함.
//		Student stud = studService.makeStudentOne();
		
//		System.out.println("학생의 평균점수를 출력하시오.");
//		System.out.println(stud.avg);
		
		//============================================/
		System.out.println("학생수를 입력하시오.");

		
		// StudentService 객체에 있는 정보를 변수 studInfo 배열에 담아 선언함.
		Student [] studInfo = studService.makeStudents();
		
		// 배열 수 출력
		System.out.println(studInfo.length);
		
		System.out.println("=================");
		
		StudentController studentController = new StudentController();
		
		// 멤버 접근 : 참조변수명.메서드명();
		studentController.start();

	}

}
