package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* 로그인 성공 했을 때만 진행함
		 * MMORPG
		 * 시작레벨:1
		 * 몬스터를 잡아야지 레벨업 하는데,
		   모든 몬스터의 경험치는 동일하다.
		 * 최대레벨:15  (15까지 찍고 끝남)
		 
		 ** 3의 배수 => 3으로 나누었을 때 나머지가 0인 것 
		 * 1레벨에서 2레벨로 갈 때 잡아야 할 몬스터의 수 3마리 (1->2 :3)
		   (3번 사냥해야함 => 사냥성공 문구가 3번 출력되어야 함)
		 * 2레벨에서 3레벨로 갈 때 잡아야 할 몬스터의 수 6마리 (2->3 :6)
		   (6번 사냥해야함 => 사냥성공 문구가 6번 출력되어야 함)
		 * 3레벨에서 4레벨로 갈 때 잡아야 할 몬스터의 수 9마리 (3->4 :9)
		   (9번 사냥해야함 => 사냥성공 문구가 9번 출력되어야 함)
		 * 4레벨에서 5레벨로 갈 때 잡아야 할 몬스터의 수 12마리 (4->5 :12)
		 * ...
		 * 14레벨에서 15레벨로 갈 때 잡아야 할 몬스터의 수 42마리 (14->15 :42)
	
		 * 레벨업 할 때마다 "레벨업했습니다. 축하합니다" 문구 출력되어야 함 
		 
		 ** 5의 배수 => 5로 나누었을 때 나머지각 0인 것 
		 * GOLD : 0
		 * 최초 5레벨 달성 시 : 1000골드 지급됨
		 * 10레벨 달성 시 : 2000 골드 지급됨
		 * 최대(MAX) 15레벨 달성 시: 3000골드 지급됨
	
		 * 랩업시 게임을 계속할 지 종료할 지 선택함.
		 * 종료되었을 경우, 현재 레벨과 가지고 있는 골드가 출력되어야 함.
		*/
		
		boolean login = false;
		int id = 1234;
		int pw = 5678;
		int i = 0;
		
		while(i==0) {
			System.out.println("1.로그인시도 2.프로그램 종료");
			int mode = sc.nextInt();
			String str = "로그인시도";
			if(mode==1) {
				System.out.println("ID를 입력하세요");
				int userId = sc.nextInt();
				System.out.println("패스워드를 입력하세요");
				int userPw = sc.nextInt();
				// 로그인 성공 시 프로그램 종료되어 break 사용함.
				if(id==userId && pw==userPw) {
					login=!false;
					System.out.println("로그인 성공");
					break;
				}
				else {
					System.out.println("로그인 실패");
				}
			}
			else {
				//login = false;
				//login =! login;
				break;
			}
			
		} //while문 끝 
		System.out.println("프로그램 종료");
		
		/* 횟수가 정해져 있기 때문에 while문보다 for문을 쓰는 것이 더 맞다.
		 * 
		*/
		int j=0;
		int level = 1;
		int count = 3;
		// int finalLevel = 15;
		int gold = 0;
		
		if(login) {
			
			// 한단계씩 레벨업하는 반복문
			for(level=1;level<15;level++) {
				//count=3*level;
				
				// 지갑에 돈을 누적시킨다. (5로 나눈 나머지가 0과 같다면)
				if(level%5==0) {
					System.out.println(level+"랩 달성 축하합니다.");
					//gold = gold+1000;
					gold = gold + level/5*1000;
				}
				
//				if(level==15) 할 수 없다. 
//				왜? 15가 되면 for문이 종료되기 때문에 
					
				//랩업시 게임을 계속할지 종료할지 선택함.
				System.out.println("1. 사냥시작 2. 게임종료");
				int select = sc.nextInt();
				if(select !=1) {
					break;
				}
				//사냥을 몇 번 하느냐 반복해줌 (단계별 몇 마리 사냥하는지를 나타내는 반복문)
				for(int monster=0;monster<level*3;monster++){
					System.out.println(monster + " 마리 사냥 성공");
				}
								
				
				//한단계 랩업 시 문구 출력 
				System.out.println(level+1+"로 레벨업했습니다.");
					
			}
			if(level==15) {
				gold=gold+3000;
			}
			
			//현재 레벨, GOLD가 출력 
			System.out.println("현재 레벨"+level);
			System.out.println("현재 골드"+gold);
			
		}
	
	}
}
