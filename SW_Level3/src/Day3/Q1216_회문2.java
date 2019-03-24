package Day3;

import java.util.Scanner;

public class Q1216_È¸¹®2 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		for (int z = 0; z < 10; z++) {
			int num = sc.nextInt();
			String tmpArr[] = new String[100];
			char arr[][] = new char[100][100];

			for (int i = 0; i < 100; i++) {
				tmpArr[i] = sc.next();

			}

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {

					arr[i][j] = tmpArr[i].charAt(j);
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}

			int max_result = 0;

			int k = 1;
			for (int i = 0; i < 100 - k + 1; i++) {

				for (int j = 0; j < 100; j++) {
					boolean bool = true;

					int a = 0;
					// int tmpCnt = 0;
					while (a <=k) {
						if (arr[i][j + a] != arr[i][j + k - 1 - a]) {

							bool = false;

						} else {
							break;
						}

						a += 1;

						if (bool == true) {
							max_result = k;
						}
					}
					k += 1;

				}

			}

//			for (int i = 0; i < 8 - num + 1; i++) {
//				for (int j = 0; j < 8; j++) {
//
//					boolean bool = true;
//
//					int a = 0;
//
//					while (a != Math.floor(num / 2)) {
//
//						if (arr[i + a][j] != arr[i + num - 1 - a][j]) {
//							// tmpCnt += 1;
//							bool = false;
//
//						}
//
//						a += 1;
//
//					}
//
//					if (bool == true) {
//
//						cnt += 1;
//					}
//
//				}
//
//			}

			System.out.println("#" + (num) + " " + max_result);

		}
	}

}
