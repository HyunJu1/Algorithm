package Day2;

import java.util.Scanner;

/*
 * 테이블 위에 자성체들이 놓여 있다.

자성체들은 성질에 따라 색이 부여되는데, 푸른 자성체의 경우 N극에 이끌리는 성질을 가지고 있고, 붉은 자성체의 경우 S극에 이끌리는 성질이 있다.

아래와 같은 테이블에서 일정 간격을 두고 강한 자기장을 걸었을 때, 시간이 흐른 뒤에 자성체들이 서로 충돌하여 테이블 위에 남아있는 교착 상태의 개수를 구하라.

아래는 자성체들이 놓여 있는 테이블을 위에서 바라본 모습이다.
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


			// 1: N극, 2: S극 / 위쪽 : N, 아랫쪽 : S
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
