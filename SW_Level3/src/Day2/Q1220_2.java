package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * ���̺� ���� �ڼ�ü���� ���� �ִ�.

�ڼ�ü���� ������ ���� ���� �ο��Ǵµ�, Ǫ�� �ڼ�ü�� ��� N�ؿ� �̲����� ������ ������ �ְ�, ���� �ڼ�ü�� ��� S�ؿ� �̲����� ������ �ִ�.

�Ʒ��� ���� ���̺��� ���� ������ �ΰ� ���� �ڱ����� �ɾ��� ��, �ð��� �帥 �ڿ� �ڼ�ü���� ���� �浹�Ͽ� ���̺� ���� �����ִ� ���� ������ ������ ���϶�.

�Ʒ��� �ڼ�ü���� ���� �ִ� ���̺��� ������ �ٶ� ����̴�.
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
			// 1: N��, 2: S�� / ���� : N, �Ʒ��� : S
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
