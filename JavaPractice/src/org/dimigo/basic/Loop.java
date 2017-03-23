/**
 * 
 */
package org.dimigo.basic;

import java.util.Scanner;
import java.util.Random;

/**
 * <pre>
 * org.dimigo.basic
 * 		|_ Loop
 * 
 * 1. Overview : 
 * 2. Date : 2017. 3. 15.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		int attack = 100;
		
		String[] work = {"마법사", "영주", "기사", "농민"};
		String job;
		
		do {
			System.out.println("------------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("------------------");
			System.out.println("메뉴 입력 => ");
			
			switch (choice = scanner.nextInt()) {
			case 1:
				attack += 10;
				System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n", attack);
				break;
			case 2:
				attack -= 10;
				System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n", attack);
				break;
			case 3:
				job = work[rand()];
				System.out.printf("%s(으)로 설정되었습니다.\n", job);
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				break;
			default: 
				System.out.println("없는 메뉴입니다.");
				
			}
		} while(choice != 9);
		scanner.close();
	}

	static int rand() {
		Random random = new Random();
		
		return random.nextInt(4);
	}
}
