package third;

import java.util.Scanner;

public class 문자열반복_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char arr[][] = new char[n][19];
		int arr2[] = new int[8];
		String str;
		for (int i = 0; i < n; i++) {

			arr2[i] = sc.nextInt();
			str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int kk = 0; kk < arr2[i]; kk++) {
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}
