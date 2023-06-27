package com.iu.study1;

public class Study1 {
	
	public static void main(String [] args){
		// 문자열(상수) 출력
		System.out.println("Program Start");
		
		// 변하는 DATA => "변수"라 부른다.
		// 변하지않는 DATA => "상수"라 부른다.
		// age라는 변수에 정수(Int)를 담을것이다라고 선언해줌 
//		메모리에 4 바이트 공간을 하고, 메모리 주소를 age라고 하자.
		int age; // 변수 선언 (데이터가 어떤 타입인지 선언해줌)
		double weight;
		
		// 변수 하나에는 하나의 값만 담을 수 있다.
		// 변수에 Data를 대입한다.
		age = 20;  // 이전 데이터는 없어짐
		age = 50;  // 50을 0과 1로 바꿔서 메모리에 저장됨.
		System.out.println(age);
		// age 에 있는 변수의 값을 출력해주세요.
		
//		변수선언 규칙 : 데이터Type명 변수명;
//		중복선언할 수 없다.
		
		/*
		 * 메모리(RAM)에서는 각 꼭지점마다 메모리의 주소가 있다. 
		 * 꼭지점의 주소를 알아야 한는데 윈도우(OS)가 지정해준다.
		 */
		// 변수 선언 (어떤 데이터를 담기위해 메모리 확보해주세요)
		byte num1;
		short num2;
		int num3;
		long num4;
		
		/*
		 * 변수에 Data를 대입 
		 * (초기화) 초기화 : 변수를 선언하고 최초로 값을 대입하는 것을 의미한다.
		 * 변수는 초기화하지 않으면 사용이 불가하다.
		 * 변수는 초기화를 꼭 해야함.
		 */
		num1 = 3;
		num2 = 130;
		num3 = 2000000000;
		num4 = 300000000000L;
		
//		변수에 Data를 대입 (초기화는 아니다)
		num1=5;
		
//		선언과 동시에 초기화함
		int num5 = 25;
		float f1 =3.2F;
		double d1 = 3.25;
		// 문자는 한글자만 가능하다.
		char ch = 'a';
		
		//논리(맞다, 틀리다)
		boolean check = true;  //false
		
		//문자열(Reference Type)
		String name = "winter";
		
		System.out.println(num5);
		System.out.println(f1);
		System.out.println(ch);
		System.out.println(check);
		System.out.println(name);
		
		/*
		 * System.out.println("물의 온도가 100도C가 된다면 스프 넣기");
		 */		
		
		System.out.println("Program End");
	}

}
