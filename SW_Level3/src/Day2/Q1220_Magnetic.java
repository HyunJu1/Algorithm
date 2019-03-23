package Day2;

import java.util.Scanner;

public class Q1220_Magnetic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int arr[][] = new int[num][num];

		for (int a = 1; a <= 10; a++) {
			int cnt = 0;
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					arr[i][j] = sc.nextInt();

				}
			}

			for (int i = 0; i < num; i++) {
				int check = 0;
				for (int j = 0; j < num; j++) {

					if (arr[j][i] == 0) {
						continue;
					} else if (check == 0 && arr[j][i] == 2) {
						continue;
					} else if (check == 1 && arr[j][i] == 2) {
						cnt++;
						check = 0;
					} else if (arr[j][i] == 1) {
						check = 1;
					}

				}
				
			}
			System.out.println("#" + (a) + " " + cnt);
		}
	}

}
