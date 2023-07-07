package com.iu.study4.s2;

public class Student {
	
	String name;
	int num;
	int kor;  //국어점수
	int eng;
	int math;
	int total;   //총점
	double avg; // 평균
	
	/* 멤버메서드 선언
	 * 메서드명 : cal
	 * 해당 인스턴스의 total, avg 계산하여 대입한다.
	 * 국,영,수학 값이 들어가 있는 상태에서 시작함.
	 * 매개변수 필요없는 이유 : 멤버변수에 선언되어 있기 때문.
	*/
	public void cal() {
		//만들어진 객체의 자기 자신을 의미함 : this  
		// 만들어진 객체의 total
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total/3.0;
		
	}
	
}
