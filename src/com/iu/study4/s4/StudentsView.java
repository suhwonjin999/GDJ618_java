package com.iu.study4.s4;


public class StudentsView {
	
	public void view(Students students) {
		System.out.println(students.getName());
		System.out.println(students.getNum());
		System.out.println(students.getAvg());
	}
	
	public void view(Students [] students) {
		
		for(int i=0; i<students.length; i++) {
			
			Students student = students[i];  // 하나 꺼내면 Student 타입이다.
			
//			System.out.println(student.name);
//			System.out.println(student.num);
//			System.out.println(students[i].avg);
			
			// this : 새로 만드는 new의 개념이다.
			this.view(student);
			System.out.println("================");
			
		}
		
	}

}
