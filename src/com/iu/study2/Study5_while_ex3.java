package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex3 {

	public static void main(String[] args) {
		Random random = new Random();
		
		/* random 시 nextInt(3) : 0~2까지 출력 
		 * random 시 nextInt(10) : 0~9까지 출력 
		 */
		
		//TRPG
		int hp=40; //user의 HP(체력바)
		int monsterHp=60; // 몬스터의 HP(체력바)
		int monsterPower=40;  // 몬스터의 공격력 => 필요없는 변수
		
		/* user 정보 출력 : 현재 HP가 얼마인지 => 뭘 판단해??? 
		 * 몬스터 정보 출력 : 몬스터의 HP가 얼마인지.
		 * user 차례
		 * 1. 평타
		 * 2. 스킬
		 * 3. HP회복
		 * 4. 턴 넘기기(도망)
		 * 1번부터 4번 중 하나를 선택함.
		 * 평타 공격 시 : 0~10 미만의 공격이 몬스터에게 적용함
		   (0 : 효과없음)
		   스킬 시 : 0~30 미만의 공격이 몬스터에게 적용함
		   단, 스킬공격은 최대 3번까지 가능하다. 
		   회복 시 : 회복량 0~최대 40까지 적용됨 (40X)  
		   (40이 넘어가면 HP는 40으로 유지)
		   도망 시 : 50% 확률로 성공, 도망실패 
		 * monster 차례
		   유저 공격: 0~40 미만의 공격을 유저에게 준다.
		 	  	   (최대 40 : 최고로 강함)
		 * 반복문 종료: user가 죽거나 monster가 죽거나 user가 
		  		    도망에 성공하였을 경우 FOR문을 빠져나온다. 
		*/
		
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		int skillCount=3;
		
		while(flag) {
			System.out.println("1.평타 2.스킬 3.HP회복 4.도망");
			int select = sc.nextInt();
			
			// 너가 선택한 값이 1번이라면 
			if(select==1) {
				//평타에 관한 코드
				//Damage (0부터 10 미만의 랜덤)
				select = random.nextInt(10);
				monsterHp = monsterHp-select;
				System.out.println("몬스터에게"+select+" 피해를 주었습니다.");
				// monsterHP가 0이 되었다면 죽음.
				if(monsterHp<1) {
					System.out.println("몹이 죽었습니다");
					break;
				}
				
			}
			else if(select==2){
				// 스킬에 관한 코드 
				if(skillCount>0){
					select = random.nextInt(30);
					monsterHp = monsterHp-select;
					System.out.println("몬스터에게"+select+" 피해를 주었습니다.");
					// monsterHP가 0이 되었다면 죽음.
					if(monsterHp<1) {
						System.out.println("몹이 죽었습니다");
						break;
					}
					skillCount--; 
				}
				else {
					System.out.println("마나가 부족합니다.");
				}	
			}
			else if(select==3) {
				//회복
				select = random.nextInt(41);  //최대 40까지 
				hp = hp+select;
				if(hp>40) {
					hp = 40; 
				}
				System.out.println("Hp를 회복하였습니다.");
			}
			else {
				// 도망에 관한 코드
				select = random.nextInt(1001);
				//0부터 1000사이에 홀수가 나오면 성공, 짝수가 나오면 실패!
				if(select%2 !=0) {
					System.out.println("도망 성공하였습니다.");
					break;
				}
				else {
					System.out.println("도망 실패하였습니다.");
				}				
			} //유저 메뉴 끝
			
			//Monster 메뉴
			select = random.nextInt(41);
//			유저의 데이터에서 랜덤한 데이터를 빼내어 업그레이드시킴
			hp = hp -select;
			System.out.println("유저에게"+select+" 피해를 주었습니다.");
			if(hp<1) {
				System.out.println("You Die");
				break;
			}
			
			
		} // while문 종료

/*		user와 몬스터가 둘 중 하나 죽을때까지 때리는 게임이므로 때리는 횟수 모름
 * 		때리는 횟수(반복횟수) 알 수 없으므로 FOR문을 안쓰고 While문을 사용한다.
		for(int i=0;i<4;i++) {
			int num = random.nextInt(4);
			
			switch(num) {
			case 0: 
				System.out.println("평타공격");
				break;
			case 1:
				System.out.println("스킬");
				break;
			case 2:
				System.out.println("HP회복");
				break;
			case 3:
				System.out.println("도망");
			}
	
		}
		System.out.println("프로그램 종료");
*/		
		

	}

}
