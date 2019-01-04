package Day7;
import java.util.Scanner;

public class Q2005_파스칼삼각형 {

	public static void main(String[] args) {
		// 왼쪽 오른쪽 위의 합... ↖ + ↗
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int idx = 0; idx < x; idx++) {

			int height = sc.nextInt();
			int arr[][] = new int[height + 1][height + 1];

			arr[0][0] = 1;

			for (int i = 0; i < height; i++) {
				for (int j = 0; j <= i; j++) {
					if (i - 1 != -1 && j - 1 != -1) {
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];

					} else {
						arr[i][j] = 1;
					}
				}
			}
			System.out.println("#" + (idx + 1) + " ");
			
			for (int i = 0; i < height; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}

		}

	}

}
