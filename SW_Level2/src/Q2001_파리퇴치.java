import java.util.Scanner;

public class Q2001_ÆÄ¸®ÅðÄ¡ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int nLen = sc.nextInt();
			int mLen = sc.nextInt();
			int arr[][] = new int[nLen][nLen];

			for (int j = 0; j < nLen; j++) {
				for (int jj = 0; jj < nLen; jj++) {

					arr[j][jj] = sc.nextInt();
				}
			}

			int max = 0;
			for (int k = 0; k < nLen - mLen + 1; k++) {

				for (int g = 0; g < nLen - mLen + 1; g++) {

					int sum = 0;

					for (int y = k; y < mLen + k; y++) {
						for (int z = g; z < mLen + g; z++) {
							 //System.out.print(arr[y][z] + " ");
							sum += arr[y][z];
						}
						
						//System.out.println();
						
						
					}
					//System.out.println();

					if (max < sum) {
						max = sum;

					}

				}

			}

			System.out.println("#" + (i + 1) + " " + max);
		}
	}
}
