package com.iu.study6;

public class StudentView {
	
	/* Student 정보를 출력하기 위한 Class이다.
	 * 메서드명 : view 
	 * 학생의 정보를 출력 : main 메서드
	 * main 메서드에 있는 학생 정보를 view에서 받아 출력하려고 한다.
	   어떻게 해야할까?
	*/
	
	/* main 메서드{
	 *  //StudentView 클래스를 인스턴스화하여(new) sv이라는 변수에 넣었다. 
	 *  StudentView sv = new StudentView();
	 *  // s1에 들어있는 이름과 성별 정보를 꺼내어 sv 변수를 통해 view 메서드에서 출력되도록 하겠다.
	 * 	sv.view(s1.name,s1.gender);
	 * }
	*/
	
	//public void view(String name, char gender){
	//	System.out.println(name);
	//  System.out.println(gender);
	//}
	public void view(Students student) {
		System.out.println(student.name);
		System.out.println(student.gender);
		
		/** view메서드 안의 정보가 출력됨(주정보로 인식). 
		 *  main 메서드에 있는 정보가 출력이 안됨.  
		Students s1 = new Students();
		s1.name="winter";
		s1.gender='F';
		System.out.println(s1.name);
		System.out.println(s1.gender);
		**/
	}
	
	/* 메서드명 : viewAll
	 * 모든 student등 정보를 출력
	 * 단, viewAll 매개변수는 딱 한개만 선언하여 두개의 정보를 모두 출력하여라.
	*/
	
	// 내가 한 방법 
	public void viewAll(Students s1, Students s2) {

		System.out.println(s1.name);
		System.out.println(s2.name);
	}
	
	// 학생들을 모은 배열 받기 
	public void viewall(Students [] students) {
		// 배열의 길이만큼 출력하여라.
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].gender);
		}
	}
	
	
	

}
