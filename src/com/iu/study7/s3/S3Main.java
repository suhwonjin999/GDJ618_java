package com.iu.study7.s3;

public class S3Main {

	public static void main(String[] args) {
		
		Worrier worrier = new Worrier();
		worrier.getItem();
		
		Magician magician = new Magician();
		magician.getItem();
		
		// is a  : 상속 관계 
		// has a : 멤버변수로 선언함
		// worrier.axe.name
		Character character = magician;
		
		// 부모가 알고있는 것 까지만(부모영역까지만) 접근이 가능하다.
		// 자식 클래스 타입으로 바꾼 다음 자식클래스 내에 있는 변수를 꺼내온다. (다형성)
		// 자식 클래스 magician에서 mp 데이터가 존재하기 때문에 바로 꺼내쓸 수 있다.
		// 위의 변수 선언으로 인해 부모클래스인 character 의 데이터 타입은 magician 이다.
		magician.setMp(20);
		
		// 부모 클래스 character에서 mp 데이터가 존재하지 않기 때문 바로 꺼내쓸 수 없다.
		//character.getMp;
		// 부모 클래스 character에서 mp 데이터를 꺼내쓰려면 자식클래스로 형변환해야함(다형성)
		magician = (Magician)character;
		
		magician.setMp(0);
		
		
		character = worrier;
		
		Character [] w = new Character[2];
		w[0]= worrier;
		w[1]= magician;
		
		// worrier = w[0];
		// 다형성 사용 : Reference 타입끼리 형변환해줌(형태를 바꿔줌) 
		worrier = (Worrier)w[0];
		
		magician = (Magician)w[1];
		
		Character ch1 = new Character();
		magician = (Magician)ch1;
		magician.setMp(20);
		

	}

}
