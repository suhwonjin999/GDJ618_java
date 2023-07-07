package com.iu.study4.s4;

import java.util.Scanner;

public class StudentsService {
	
	public Students [] makeStudents() {
		// 학생 한명 생성
		//Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요");
		// 학생 수 입력하기
		int number = sc.nextInt();
		
		// 학생 수만큼 배열에 담아라
		Students [] students = new Students [number];
		
		// getter 메서드 이용하여 값 가져오기.
		for(int i=0;i<number;i++) {
			// 학생 여러명 생성
			Students student = new Students();
			
			System.out.println("학생의 이름을 입력하세요.");
			// 참조변수명.변수명
			student.setName(sc.next());
			
			System.out.println("학생의 번호를 입력하세요.");
			student.setNum(sc.nextInt());
			
			System.out.println("학생의 국어점수를 입력하세요.");
			student.setKor(sc.nextInt());
			
			System.out.println("학생의 영어점수를 입력하세요.");
			student.setEng(sc.nextInt());
			
			System.out.println("학생의 수학점수를 입력하세요.");
			student.setMath(sc.nextInt());
			
//			student.total = student.kor + student.eng + student.math;
//			student.avg = student.total/3.0;
			//cal 메서드를 호출하여 총점과 평균을 자동계산함.
//			students.cal();
			// students의 i번째에 student 정보를 집어넣자.
//			students[i] = students;
	}
		
		return students;
			
	}

}
