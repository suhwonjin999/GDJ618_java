package com.iu.study4;

import java.util.Arrays;

public class StudyMain {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		
		/* 선언한 클래스명는 데이터 타입이다. 
		  (우리가 만드는 데이터 타입이기 때문에 레퍼런스 타입에 해당한다.)
		 * card 변수에 카드 타입 선언함 => 스택영역 차지(지역변수에 해당함.)
		 * 실제 눈에 보이는 객체를 힙 영역에 만들어준다.
		 * new Card(); => 힙 영역 차지(인스턴스 변수에 해당함.)
		 			   => 힙 영역에 CardNumber, name, cvc로 저장됨.
		 			   
		 * card 와 card2는 보이는 형태는 동일하나, 두 변수는 다르다. 
		 */
		Card card = new Card();
		
		Card card2 = new Card();
		
		System.out.println("========================");
		
		// 우리가 정의한 데이터 타입  변수명 = new 클래스명과 동일한 이름();
		Student s1 = new Student();
		
		s1.grade = 1;
		s1.name = "winter";
		s1.gender = 'M';
		
		Student s2 = new Student();
		s2.name = "winter";
		s1.gender = 'F';
		
		// 방 2칸 만들고 첫번째 칸에 s1에 대한 데이터를 담고, 두번째 칸에 s2에 대한 데이터를 담는다.
		Student [] students = new Student [2];
		// s1.name = String 타입이기 때문에 Student 타입만 들어올 수 있는 방에 들어올 수 없다.
		students[0] = s1;
		students[1] = s2;  // 동일한 타입이기 때문에 s1도 담을 수 있다.
		
		/**
		// 인덱스 2번째 인 방이 존재하지 않기 때문에 null(알수없는 값)이 출력됨
		// 레퍼런스의 기본 값 : null 이다.
		System.out.println(students[2]);  // null 출력됨.
		*/
		/* 실행 시 발생하는 오류 발생함. */
		// System.out.println(students[2].name); 
		
		System.out.println(Arrays.toString(students)); // 주소값 출력됨.
		
		for(int i=0;i<students.length;i++) {
			System.out.println(i+1+"번째 학생 출력");
			System.out.println(students[i]); // 학생이 가리킨 주소값 출력됨.
			System.out.println(students[i].name); // 학생의 이름 출력됨.
			System.out.println(students[i].id);
		}
		/**
		Student s3 = null;
		
		// 객체를 쓰려면 객체부터 만들어야 함. 
		s3.name = "iu"; //null.name
		
		Student s4 = new Student();
		*/
				
		/* 카드가 가리키는 주소에 가서 카드의 정보(카드번호)에 3.1을 대입하여 선언함.  
		*/
		card.cardNumber = 3.1;
		
		System.out.println(card.cvc);
		
		// 카드가 가리키는 주소에 가서 카드에 있는 이름 정보를 꺼내어 카드 이름이 뭔지 출력해줘.
		System.out.println(card.name);
		
		System.out.println(s1.name +"의 학년은 "+s1.grade+" 학년이다.");
		
		// 주소값 비교함 => 출력결과 : False (둘이 다르다)
		System.out.println(s1==s2); 
		
		// 얕은 복사 
		s2 = s1;
		
		System.out.println(s2.name);
		System.out.println("========================");
		
		System.out.println("프로그램 종료");

	}

}
