/**
 * 
 */
package org.dimigo.basic;

import java.util.Scanner;
import java.util.Random;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 *
 * 1. 개요 : 무서운걔임
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 *
 * @author : yoojin    
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int myp = 100;
		int choice;
		Scanner scanner = new Scanner(System.in);
		String[] c = { "마법사", "영주", "기사", "농민" };
		String myc;
		do {
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가\n2. 공격력 감소\n3. 캐릭터 설정\n9.종료\n\n----------\n\n메뉴 입력 =>");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				myp += 10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력:" + myp);
				break;
			case 2:
				myp -= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력:" + myp);
				break;
			case 3:
				myc = c[new Random().nextInt(4)];
				System.out.println(myc + "(으)로 설정되었습니다.");
				break;
			case 9:
				System.out.println("이제 공부 ㄱㄱ");
				break;
			default:
				System.out.println("없는 메뉴입니다!!");
			}
			if (choice == 9) {
				scanner.close();
				break;
			}
		} while (true);

	}

}
