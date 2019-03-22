package Day2;

import java.util.Scanner;

public class Q4406_모음이보이지않는사람 {

	/*
	 * 이건 실질적으로 Level1 문제. 알파벳 소문자 만으로 이루어진 단어를 당신은 어떤 식으로 보게 될까? 알파벳에서 모음은 ‘a’,
	 * ‘e’, ‘i’, ‘o’, ‘u’의 다섯가지로 예를 들어 “congratulation”이라는 단어를 당신이 보게 되면
	 * “cngrtltn”으로 인식하게 될 것이다.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		String remove[] = { "a", "e", "i", "o", "u" };
		for (int i = 0; i < num; i++) {
			String x = sc.next();

			for (int j = 0; j < remove.length; j++) {
				x = x.replaceAll(remove[j], "");
			}
			System.out.println("#" + (i + 1) + " " + x);

		}

	}

}
