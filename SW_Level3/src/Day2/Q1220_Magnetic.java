package Day2;

import java.util.Scanner;

/*
 * ���̺� ���� �ڼ�ü���� ���� �ִ�.

�ڼ�ü���� ������ ���� ���� �ο��Ǵµ�, Ǫ�� �ڼ�ü�� ��� N�ؿ� �̲����� ������ ������ �ְ�, ���� �ڼ�ü�� ��� S�ؿ� �̲����� ������ �ִ�.

�Ʒ��� ���� ���̺��� ���� ������ �ΰ� ���� �ڱ����� �ɾ��� ��, �ð��� �帥 �ڿ� �ڼ�ü���� ���� �浹�Ͽ� ���̺� ���� �����ִ� ���� ������ ������ ���϶�.

�Ʒ��� �ڼ�ü���� ���� �ִ� ���̺��� ������ �ٶ� ����̴�.
 */
public class Q1220_Magnetic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int a = 1; a <= 10; a++) {
			

			int num = sc.nextInt();
			int arr[][] = new int[num][num];

			int cnt = 0;
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					arr[i][j] = sc.nextInt();

				}
			}


			// 1: N��, 2: S�� / ���� : N, �Ʒ��� : S
			for (int i = 0; i < num; i++) {
				int check = 0;
				for (int j = 0; j < num; j++) {

					if (check == 1 && arr[j][i] == 2) {
						check = 0;
						cnt += 1;

					} else if (check == 0 && arr[j][i] == 1) {
						check = 1;
					}

				}

			}
			System.out.println("#" + (a) + " " + cnt);
		}
	}

}
