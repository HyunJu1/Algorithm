package Day5;
import java.util.Scanner;

public class Q1285_돌던지기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {

			int y = sc.nextInt();
			int arr[] = new int[y];
			int cnt = 0;

			for (int j = 0; j < y; j++) {
				arr[j] = sc.nextInt();

			}

			int min = 100000;
			for (int j = 0; j < y; j++) {
				if (Math.abs(arr[j]) - 0 < min) {
					min = Math.abs(arr[j]);
				}

			}

			for (int j = 0; j < y; j++) {
				if (Math.abs(arr[j]) == min) {
					cnt += 1;
				}

			}

			System.out.println("#" + (i + 1) + " " + min+" "+cnt);
		}

	}

}
