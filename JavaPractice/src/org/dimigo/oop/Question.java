/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : yoojin
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] questions = { "가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?" };
		String[] answers = { "기리보이", "원빈", "응용 프로그래밍" };
		StringBuilder sanswer = new StringBuilder("<<결과 출력>>");
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + "." + questions[i]);
			System.out.println((answers[i].equals(scanner.nextLine())) ? "정답입니다!" : "틀렸습니다!");
			sanswer.append("\n").append(questions[i]).append(" " + answers[i] + "입니다.");
		}
		scanner.close();
		System.out.println(sanswer);
	}

}
