package Day2;

import java.util.Scanner;

public class Q1213_String {
	/*
	 * �־����� ���� ���忡�� Ư���� ���ڿ��� ������ ��ȯ�ϴ� ���α׷��� �ۼ��Ͽ���.
	 * Starteatingwellwiththeseeighttipsforhealthyeating,
	 * whichcoverthebasicsofahealthydietandgoodnutrition. �� ���忡�� ti �� �˻��ϸ�, ���� 4�̴�.
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
