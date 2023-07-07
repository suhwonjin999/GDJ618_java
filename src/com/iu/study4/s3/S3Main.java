package com.iu.study4.s3;

public class S3Main {

	public static void main(String[] args) {
		
		/* main 메서드 안에서 test 변수 선언(객체 생성) : 스택영역에서 생성됨.
		   힙 영역에서 멤버 변수 선언함.
		   test가 가리키는 주소에 가서 method1 함수를 실행하여라.
		*/
		//객체 생성
		Test test1 = new Test();
		test1.num1 = 2;
		test1.num2 = 1.2;
		
		//method1 메서드 호출
		test1.method1();
		System.out.println(test1);


		
		// 객체의 이름이 다르기때문에 함수 실행 결과가 다름.
		
		Test test2 = new Test();
		test2.num1=2;
		test2.num2=1.2;
		test2.method1();
		System.out.println(test2);
		
		//주소 비교 :test의 주소와 test2의 주소가 동일한가?
		System.out.println(test1==test2);
		
		System.out.println("===============");
		
		// test안에 있는 same 메서드를 호출할 때 
		test1.same(test2);
		
		// Test() : 객체 생성 시 한번만 호출되는 특수한 메서드이다.
		Test test = new Test();
		
		/*  test.hap1(10, 2);
		 *  test.hap2(102, 2.1F);
		 * */
		test.hap(102, 2.1F);
		
		/* 오버로딩(OverLoading): 같은 이름의 메서드를 여러개 만드는 것 
		 * 메서드의 이름은 동일하지만, 매개변수와 타입의 구성이 다르기때문에 자동으로 알아서 찾아서 호출함.
		 * 타입의 구성과 타입의 개수에 따라 메서드를 구분한다. (변수명은 상관없음!)
		**/
		
		

	}

}
