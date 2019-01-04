package Day5;
import java.util.Arrays;
import java.util.Scanner;

public class Q1961_숫자회전 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {

			int num = sc.nextInt();
			int arr[][] = new int[num][num];

			String arr1[] = new String[num];
			
			Arrays.fill(arr1, "");
			for (int j = 0; j < num; j++) {
				for (int k = 0; k < num; k++) {
					arr[j][k] = sc.nextInt();
				}
			}

			for (int j = 0; j < num; j++) {
				String tmpS = "";
				for (int k = num - 1; k >= 0; k--) {
					tmpS = tmpS + arr[k][j];
				}

				arr1[j] += tmpS+" ";
			}

			for (int j = num - 1; j >= 0; j--) {
				String tmpS = "";
				for (int k = num - 1; k >= 0; k--) {
					tmpS = tmpS + arr[j][k];

				}

				arr1[num - j - 1] += tmpS+" ";

			}

			for (int j = num - 1; j >= 0; j--) {
				String tmpS = "";
				for (int k = 0; k < num; k++) {
					tmpS = tmpS + arr[k][j];

				}

				arr1[num - j - 1] += tmpS+" ";
			}

			System.out.println("#" + (i + 1) + " ");

			for (int j = 0; j < arr1.length; j++) {

				System.out.println(arr1[j] + " ");
			}
		
		}
	}
}
