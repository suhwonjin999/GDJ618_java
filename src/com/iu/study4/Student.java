package com.iu.study4;

public class Student {
	
	/* Student 테이블
	 * studNo(Number(8))
	 * grade (Number(1))
	 * deptno1(전공)  (Number(3))
	 * deptno2(부전공) (Number(3))
	 * name   (varchar2(20))
	 * id     (varchar2(20))
	 * gender (char(1))
	 * 클래스를 구성하는 요소를 클래스 안에 넣어 자바식으로 표현해보기
	*/
	
	// 인스턴스 변수 선언 : 초기화는 자동으로 부여함.
	int studNo;
	int grade;
	int deptno1;
	int deptno2;
	String name;
	String id;   // id의 초기화 값 : null 이다.
	char gender;

}
