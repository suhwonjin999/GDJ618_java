package com.iu.study6;

import com.iu.study4.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		// Students 클래스를 인스턴스화하여(new) s1이라는 변수에 넣었다. 
		Students s1 = new Students();
		
		s1.name="해리포터";
		s1.gender='F';
		
		Students s2 = new Students();
		s2.name="iu";
		s2.gender='F';
		
		//출력 (멤버메서드 호출하기위해 객체 생성하기)
		StudentView sv = new StudentView();
		
		//(s1.name,s1.gender);
		// s1에 들어있는 학생 정보를 꺼내어 sv 변수를 통해 view 메서드에서 출력되도록 하겠다.
		sv.view(s1);
		
		//모두 출력 (내가 한 방법==> 값을 하나하나 집어넣어야 함.)
		StudentView svall = new StudentView();
		svall.viewAll(s1, s2);
		
		System.out.println("==================");
		
		// 모두 출력 (방법2) 배열 만들기 
		Students [] students = new Students[2];
		students[0]=s1;
		students[1]=s2;
		
		sv.viewall(students);
		
		System.out.println("프로그램 끝");
		

	}

}
