package com.iu.study4.s2;

import java.util.Scanner;

public class StudentService {
	
	// 매개변수 통해서 데이터를 받아서 하나씩 꺼내서 번호를 비교함.
	// 학생들을 모아놓은 배열 컨트롤러 호출하여 데이터를 찾는다.
	public Student findByNum(Student [] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 학생의 번호를 입력하세요");
		int num = sc.nextInt();
		
		Student student = null;
		
		//학생수가 정해져 있기때문에 for문을 사용함.
		for(int i=0;i<students.length;i++) {
			// 학생 데이터 안에 있는 번호와 입력한 학생 번호와 같습니까?
			if(num==students[i].num) {
				// 학생 데이터 안에 있는 번호를 꺼내어 담은 student 변수를 호출하자.
				student = students[i];
				break;
			}
		}
		return student;	
	}
	
	// 학생들의 정보를 담는 Class
	
	/* 학생 1명 만들어서 이름, 번호, 국어, 영어, 수학점수 계산
	 * 총점과 평균을 계산함
	 * 학생 한명을 리턴함
	*/
	public Student makeStudentOne() {
		
		//객체 생성 (학생 한명을 만들어라)
		Student student = new Student();
		
		Scanner sc = new Scanner(System.in);
		   
		//반복문을 사용하여 입력함.
		System.out.println("학생의 이름을 입력하세요.");
		// 참조변수명.변수명
		student.name = sc.next();
		
		System.out.println("학생의 번호를 입력하세요.");
		student.num = sc.nextInt();
		
		System.out.println("학생의 국어점수를 입력하세요.");
		student.kor = sc.nextInt();
		
		System.out.println("학생의 영어점수를 입력하세요.");
		student.eng = sc.nextInt();
		
		System.out.println("학생의 수학점수를 입력하세요.");
		student.math = sc.nextInt();
		
		//학생의 총점수 구하기 (학생의 국어, 영어, 수학점수 꺼내서 모두 더하라)
		student.total = student.kor + student.eng + student.math;
		
		// 학생의 평균점수 구하기 = 3.0으로 하여 double 타입으로 만들어서 대입한다.
		student.avg = student.total/3.0;
		
		return student;		
	}
	
	//===========================================/
	
	/* 학생 수 입력받는다.
	 * 학생 수만큼 학생들이 만들어짐. (Student 객체 생성함.)
	 * 학생 한명 당 이름, 번호, 국어, 영어, 수학 점수입력함.
	 * 학생 한명 당 하나씩 총첨과 평균을 자동 계산하여 대입해준다.
	 * 학생들을 리턴해줌.
	 * 어떤 부분부터 시작해야 할까? (실행순서 생각해보기)
	 * main 메서드에서 호출하여 결과 찍어보기.
	 * 실행 순서:
	   1. 학생 수만큼 배열을 생성함.
	   2. 학생 수만큼 반복문이 실행됨.
	   3. 반복문 내에서 이름, 번호, 국어점수, 영어점수, 수학점수 입력
	   4. 총점과 평균을 계산하여 만듦.
	   5. 해당 학생을 배열에 대입함.
	*/

/**	
 * 매개변수 선언하면서 생성함 
	public void makeStudents(int number) {
		
		Scanner sc = new Scanner(System.in);
		
		// 학생 수 입력하기(매개변수에 값 대입하기)
		number = sc.nextInt();
		
		// 학생 수만큼 배열에 담아라
		int [] students = new int[number];
		
		// 배열을 출력하기 위해 return; (배열 반환해줘야 함) => 출력은 main 메서드에서 함!
	}
**/	
	public Student [] makeStudents() {
		// 학생 한명 생성
		//Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요");
		// 학생 수 입력하기
		int number = sc.nextInt();
		
/**		for(int i=0;i<number;i++) {
			System.out.println("학생의 이름을 입력하세요.");
			// 참조변수명.변수명
			student.name = sc.next();
			
			System.out.println("학생의 번호를 입력하세요.");
			student.num = sc.nextInt();
			
			System.out.println("학생의 국어점수를 입력하세요.");
			student.kor = sc.nextInt();
			
			System.out.println("학생의 영어점수를 입력하세요.");
			student.eng = sc.nextInt();
			
			System.out.println("학생의 수학점수를 입력하세요.");
			student.math = sc.nextInt();
			
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total/3.0;
			
			// students의 i번째에 student 정보를 집어넣자.
			students[i] = student;
		}
**/
		
		// 학생 수만큼 배열에 담아라
		Student [] students = new Student [number];
		
		for(int i=0;i<number;i++) {
			// 학생 여러명 생성
			Student student = new Student();
			
			System.out.println("학생의 이름을 입력하세요.");
			// 참조변수명.변수명
			student.name = sc.next();
			
			System.out.println("학생의 번호를 입력하세요.");
			student.num = sc.nextInt();
			
			System.out.println("학생의 국어점수를 입력하세요.");
			student.kor = sc.nextInt();
			
			System.out.println("학생의 영어점수를 입력하세요.");
			student.eng = sc.nextInt();
			
			System.out.println("학생의 수학점수를 입력하세요.");
			student.math = sc.nextInt();
			
//			student.total = student.kor + student.eng + student.math;
//			student.avg = student.total/3.0;
			//cal 메서드를 호출하여 총점과 평균을 자동계산함.
			student.cal();
			// students의 i번째에 student 정보를 집어넣자.
			students[i] = student;
	}
		
		return students;
			
	}
	
	
	
}
