package Day2;

import java.util.Scanner;

public class Q1213_String {
	/*
	 * 주어지는 영어 문장에서 특정한 문자열의 개수를 반환하는 프로그램을 작성하여라.
	 * Starteatingwellwiththeseeighttipsforhealthyeating,
	 * whichcoverthebasicsofahealthydietandgoodnutrition. 위 문장에서 ti 를 검색하면, 답은 4이다.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int cnt = 0;
			int index = sc.nextInt();
			String research = sc.next();
			String origin_string = sc.next();
			int a = 0;
			for (int j = 0; j < origin_string.length(); j++) {

				if (origin_string.charAt(j) == (research.charAt(a))) {
					a += 1;

				} else {
					a = 0;
					if(origin_string.charAt(j) == (research.charAt(a))){
						a += 1;	
					}
				}

				if (a == research.length()) {
					cnt += 1;
					a = 0;
				}
			}

			System.out.println("#" + (index) + " " + cnt);
		}

	}

}
