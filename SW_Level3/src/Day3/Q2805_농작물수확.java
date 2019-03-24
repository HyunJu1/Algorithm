package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2805_농작물수확 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			int N = sc.nextInt();

			String[] tmpArr = new String[N];
			int[][] arr = new int[N][N];

			for (int j = 0; j < N; j++) {
				tmpArr[j] = sc.next();
				// System.out.print(tmpArr[j]+" ");
			}
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					arr[j][k] = Character.getNumericValue((tmpArr[j].charAt(k)));
					// System.out.print(arr[j][k]+" ");
				}

			}
			int sum = 0;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					int diff = Math.abs(j - (int) (N / 2));

					if (k < N - diff && k >= diff) {
						sum += arr[j][k];
					}

				}
			}

			System.out.println("#" + (i + 1) + " " + sum);

		}
	}

}
