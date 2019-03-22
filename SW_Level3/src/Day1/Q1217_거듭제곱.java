package Day1;

import java.util.Scanner;

public class Q1217_°ÅµìÁ¦°ö {

	private static int recursive_call(int n, int m) {

		int result = 0;

		if (m > 1) {
			result=n*recursive_call(n, m - 1);
			
			return result;
		} else {
			return n;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();

			int n = sc.nextInt();
			int m = sc.nextInt();
			int result = recursive_call(n, m);

			System.out.println("#" + (num) + " " + result);
		}
	}

}
