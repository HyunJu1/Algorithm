package sixth;

import java.util.Scanner;

public class ÇÇ½Ã¹æ_1453 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		int count[] = new int[101];

		for (int i = 0; i <= 100; i++) {
			count[i] = 0;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			count[arr[i]] += 1;
		}

		for (int i = 0; i <= 100; i++) {
			if (count[i] != 0 && count[i] != 1) {
				sum = sum + (count[i]-1);

			}
		}
		System.out.println(sum);

	}
}
