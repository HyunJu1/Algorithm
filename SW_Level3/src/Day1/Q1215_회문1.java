package Day1;

import java.util.Scanner;

//�־��� 8x8 ��� �����ǿ��� ����, ���θ� ��� ���� ���õ� ���̸� ���� ȸ���� �� ������ ���ϴ� ����

public class Q1215_ȸ��1 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		for (int z = 0; z < 10; z++) {
			int num = sc.nextInt();
			String tmpArr[] = new String[8];
			char arr[][] = new char[8][8];

			int cnt = 0;

			for (int i = 0; i < 8; i++) {
				tmpArr[i] = sc.next();

			}

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {

					arr[i][j] = tmpArr[i].charAt(j);

				}
			}

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - num + 1; j++) {

					boolean bool = true;

					int a = 0;

					while (a != Math.floor(num / 2)) {

						if (arr[i][j + a] != arr[i][j + num - 1 - a]) {
							// tmpCnt += 1;
							bool = false;

						}

						a += 1;

					}

					if (bool == true) {

						cnt += 1;
					}

				}

			}

			for (int i = 0; i < 8 - num + 1; i++) {
				for (int j = 0; j < 8; j++) {

					boolean bool = true;

					int a = 0;

					while (a != Math.floor(num / 2)) {

						if (arr[i + a][j] != arr[i + num - 1 - a][j]) {
							// tmpCnt += 1;
							bool = false;

						}

						a += 1;

					}

					if (bool == true) {

						cnt += 1;
					}

				}

			}

			System.out.println("#" + (z + 1) + " " + cnt);

		}
	}

}
