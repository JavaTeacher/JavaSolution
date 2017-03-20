package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;
 
public class Loop { 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menu;
		int attackPoint = 100;  // 10씩 증가 또는 감소
		String[] character = {"마법사", "영주", "기사", "농민"};
		
		do {
			System.out.println("--------------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("--------------------");
			System.out.print("메뉴 입력 => ");
			
			menu = scanner.nextInt();			
			
			switch(menu) {
			case 1:
				attackPoint += 10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + attackPoint);
				break;
			case 2:
				attackPoint -= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + attackPoint);
				break;
			case 3:
				int random = new Random().nextInt(4);  // 0 ~ 3
				System.out.println(character[random] + "(으)로 설정되었습니다.");
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				scanner.close();
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
			}
			
		} while (menu != 9);
			
	}
}