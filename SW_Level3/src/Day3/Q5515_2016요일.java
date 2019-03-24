package Day3;

import java.util.Scanner;

public class Q5515_2016ø‰¿œ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int wk[] = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			int result = 0;
			int m = sc.nextInt();
			int d = sc.nextInt();
			int sum = 0;
			for (int j = 0; j < m; j++) {
				sum += wk[j];
			}
			result = sum + d + 3;

			System.out.println("#" + (i + 1) + " " + (int) ((result % 7)));

		}

	}
}
