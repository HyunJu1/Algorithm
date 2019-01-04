package Day7;

import java.util.Scanner;

public class Q1954_달팽이숫자 {
	// http://blog.naver.com/PostView.nhn?blogId=h850415&logNo=221423647498&parentCategoryNo=&categoryNo=37&viewDate=&isShowPopularPosts=true&from=search
	// 블로그 글 참고

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int idx = 0; idx < x; idx++) {

			int size = sc.nextInt();

			int K = size; // 각 회전 작업 시 수행 횟수 계산
			int N = 1;// 1씩 증가되는 숫자처리.
			int A[][] = new int[size][size];

			int S = 1; // 행과 열의 증가/감소처리를 위한 변수

			int ii = 0, jj = 0; // 배열의 행과 열 표시

			int sign = 1;// 부호가 1이면 양수, 0이면 음수

			int cnt = 0;
			int sizeCnt = 0;

			for (int h = 0; h < size * 2 - 1; h++) {

				if (S == 0) {// S==0이라면 행과 관련.

					for (int i = 0; i < K; i++) {

						if (sign == 1) {
							A[ii][jj] = N;
							// System.out.println("ii:" + ii + " jj:" + jj + " K: " + K + "--> A: " +
							// A[ii][jj] + " ");

							if (i != K - 1) {
								ii += 1;
							} else {
								jj -= 1;
							}

						} else {

							A[ii][jj] = N;

							if (i != K - 1) {
								ii -= 1;
							} else {
								jj += 1;
							}

						}
						N += 1;

					}

				} else {// S==1 이라면 열 간의 이동.
					for (int i = 0; i < K; i++) {
						if (sign == 1) {
							A[ii][jj] = N;

							if (i != K - 1) {
								jj += 1;
							} else {
								ii += 1;
							}

						} else {

							A[ii][jj] = N;

							if (i == K - 1) {
								ii -= 1;
							} else {
								jj -= 1;
							}
						}
						N += 1;
					}

				}
				if (S == 0) {
					S = 1;
				} else {

					S = 0; // 행으로 이동
				}
				cnt += 1;
				sizeCnt += 1;
				if (sizeCnt % 2 == 1) {
					K -= 1;
				}

				if (cnt == 2) {
					if (sign == 1) {
						sign = 0;
					} else {
						sign = 1;
					}
					cnt = 0;
				}

			}
	
			System.out.println("#" + (idx + 1) + " ");
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < A.length; j++) {
					System.out.print(A[i][j] + " ");
				}
				System.out.println();
			}

		}

	}

}
