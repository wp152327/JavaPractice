/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ Question
 * 
 * 1. Overview : 
 * 2. Date : 2017. 3. 31.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class Question {

	public static void main(String[] args) {
		int i = 0;

		Scanner scanner = new Scanner(System.in);

		String[] questions = { "가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?" };
		String[] answers = { "씨엔블루", "전윤민", "응용프로그래밍" };
		for (String question : questions) {
			i++;
			System.out.println(i + ". " + question);
			String input = scanner.nextLine().trim();
			if (answers[i - 1].equals(input)) {
				System.out.println("정답입니다!");
			} else {
				System.out.println("틀렸습니다!");
			}
		}

		scanner.close();

		i = 0;

		StringBuilder sb = new StringBuilder("<< 결과 출력 >>\n");
		for (String question : questions) {
			sb.append(question + " " + answers[i] + "입니다.\n");
			i++;
		}
		System.out.println(sb.toString());
	}
}
