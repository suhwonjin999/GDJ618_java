package com.iu.study8;

public class ApiMain {

	public static void main(String[] args) {
		// 
		// 라이브러리(API)
		// 객체생성 : 생성자명은 클래스명과 동일하다. 
		Object obj = new Object();
		
		//참조변수명.쓸수있는 변수(boolean 결과를 주는 메서드 호출함) 
		boolean check = obj.equals(null);
		
		// String 결과를 주는 매개변수 없는 메서드 호출함 
		String str = obj.toString();
		int hash = obj.hashCode();
		//String.CASE_INSENSITIVE_ORDER
		
		//멤버메서드 사용
		String st = "hello";
		st = new String("hello"); // String st = "hello"; 코드와 동일함.
		
		// 참조변수에 접근하는 방법 : 참조변수명.메서드명
		char ch = st.charAt(0);
		System.out.println(ch);

	}

}
