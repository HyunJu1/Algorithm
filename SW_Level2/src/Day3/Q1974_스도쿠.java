package Day3;
import java.util.Scanner;

public class Q1974_½ºµµÄí {

	public static boolean checking(int[][] arr) {
		// CASE 1

		for (int i = 0; i < 9; i++) {

			int sum1 = 0;
			for (int j = 0; j < 9; j++) {
				sum1 += arr[i][j];
			}
			if (sum1 != 45) {
				return false;
			}
		}
		// CASE 2

		for (int i = 0; i < 9; i++) {
			int sum2 = 0;
			for (int j = 0; j < 9; j++) {
				sum2 += arr[j][i];
			}
			if (sum2 != 45) {
				return false;
			}
		}

		// CASE 3

		for (int k = 0; k < 9; k++) {
			int sum1 = 0;
			int a = 0, b = 0;
			if (3<=k && k>=5) {
				a = 3;
				b = 3;
			} else if (6<=k && k>=8) {
				a = 6;
				b = 6;
			}
			for (int i = b; i < b + 3; i++) {
				for (int j = a; j < a + 3; j++) {
					sum1 = sum1 + arr[i][j];
				}
			}
//			System.out.println(sum1);
			if (sum1 != 45) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int arr[][] = new int[9][9];

		for (int h = 0; h < x; h++) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			boolean result = checking(arr);

			int myInt = (result) ? 1 : 0;
			System.out.println("#" + (h + 1) + " " + myInt);
		}

	}

}
