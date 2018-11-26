package fourth;

import java.util.Scanner;

public class �ؾ_11052 {


	public static void main(String[] args) {
		int arr[] = new int[1001];
		int ar[] = new int[1001];

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			ar[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (arr[i] < arr[i - j] + ar[j]) {
					arr[i] = arr[i - j] + ar[j];
				}
			}
		}
		System.out.println(arr[n]);

	}

}
