package com.iu.study4.s2;

public class StudentView {
	
	// 학생들의 정보를 출력하는 Class
	// 학생 한명을 출력하는 메서드 view1
	//public void viewOne(Student student){}
	/** 오버로딩(OverLoading): 같은 이름의 메서드를 여러개 만드는 것 
	 * 메서드의 이름은 동일하지만, 매개변수와 타입의 구성이 다르기때문에 자동으로 알아서 찾아서 호출함.
	 * 타입의 구성과 타입의 개수에 따라 메서드를 구분한다. (변수명은 상관없음!)
	**/
	public void view(Student student) {
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.avg);
	}
	
	// 출력만 하고 끝나기 때문에 return 할게 없다. 
	// 학생들의 정보를 배열에서 꺼내어 하나씩 출력함.
	public void view(Student [] students) {
		
		for(int i=0; i<students.length; i++) {
			
			Student student = students[i];  // 하나 꺼내면 Student 타입이다.
			
//			System.out.println(student.name);
//			System.out.println(student.num);
//			System.out.println(students[i].avg);
			
			// this : 새로 만드는 new의 개념이다.
			this.view(student);
			System.out.println("================");
			
		}
		
	}

}
