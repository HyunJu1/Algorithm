package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 테이블 위에 자성체들이 놓여 있다.

자성체들은 성질에 따라 색이 부여되는데, 푸른 자성체의 경우 N극에 이끌리는 성질을 가지고 있고, 붉은 자성체의 경우 S극에 이끌리는 성질이 있다.

아래와 같은 테이블에서 일정 간격을 두고 강한 자기장을 걸었을 때, 시간이 흐른 뒤에 자성체들이 서로 충돌하여 테이블 위에 남아있는 교착 상태의 개수를 구하라.

아래는 자성체들이 놓여 있는 테이블을 위에서 바라본 모습이다.
 */
public class Q1220_2 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

		// Scanner sc = new Scanner(System.in);

		// int num = sc.nextInt();
        int num = 100;
        int arr[][] = new int[num][num];

		for (int a = 1; a <= 10; a++) {
			/*
			 * for (int i = 0; i < num; i++) { for (int j = 0; j < num; j++) { arr[i][j] =
			 * sc.nextInt();
			 * 
			 * } }
			 */
			
			br.readLine();
			for(int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < 100; j++)
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }

			

			int cnt = 0;
			// 1: N극, 2: S극 / 위쪽 : N, 아랫쪽 : S
			for (int i = 0; i < num; i++) {
				int check = 0;
				for (int j = 0; j < num; j++) {

//					if (arr[j][i] == 0) {
//						continue;
//					} else if (check == 0 && arr[j][i] == 2) {
//						continue;}
//						else if (check == 1 && arr[j][i] == 1) {
//							
//							continue;
//						}
					
					 if (arr[j][i] == 1) {
							check = 1;
						}
					 if (check == 1 && arr[j][i] == 2) {
						check = 0;
						cnt += 1;

					} 
				

				}

			}
			System.out.println("#" + (a) + " " + cnt);
		}
	}

}
