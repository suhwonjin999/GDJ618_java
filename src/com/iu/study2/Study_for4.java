package com.iu.study2;

import java.util.Scanner;

public class Study_for4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/* 종료할 분,초를 입력받아서 해당 분,초가 되면 종료하여라.
		*/
		
/*		예상결과 : 6분 입력하면 바로 프로그램 종료됨
 *		실제결과 : 6분 입력한 후 초를 입력하고 나서 프로그램 종료됨.
  
		for(int min=0;min<6;min++) {
			System.out.println("분을 입력하세요");
			int bun = sc.nextInt();
			if(min==bun) {
				System.out.println(min+"분");
			}
			for(int sec=0;sec<60;sec++) {
				System.out.println("초를 입력하세요");
				int cho = sc.nextInt();
				if(sec==cho) {
					System.out.println(sec+"초");
				}
				sec=60;
			}
			min=6;
		}
		System.out.println("프로그램 종료");
*/
		
		/* 종료할 분,초를 입력받아서 해당 분,초가 되면 종료하여라.
		*/
		
		System.out.println("분을 입력하세요");
		int bun = sc.nextInt();
		System.out.println("초를 입력하세요");
		int cho = sc.nextInt();
		boolean check = false;
		
		for(int min=0;min<6;min++) {
			
			for(int sec=0;sec<60;sec++) {
				System.out.println(min+":"+sec);
				if(min==bun &&sec==cho) {
					check = true;
					min=6;
					break;
				}
			}
			
			if(check) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
