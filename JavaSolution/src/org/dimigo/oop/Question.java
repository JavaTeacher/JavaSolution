/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * |_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 26.
 * </pre>
 *
 * @author : teacher
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = {
				"가장 좋아하는 가수는?",
				"가장 좋아하는 배우는?",
				"가장 좋아하는 과목은?"
		};
		
		String[] answers = {"빅뱅", "조인성", "응용 프로그래밍"};
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("<< 결과 출력 >>\n");
		
		for (int i=0; i<questions.length; i++) {
			System.out.println(i+1 + "." + questions[i]);
			
			String answer = scanner.nextLine();
			if (answers[i].equals(answer)) {
				System.out.println("정답입니다!");
			} else {
				System.out.println("틀렸습니다!");
			}
			
			sb.append(questions[i]).append(" ").append(answers[i]).append("입니다.\n");
		}
		
		System.out.println(sb.toString());
		scanner.close();
	}

}
