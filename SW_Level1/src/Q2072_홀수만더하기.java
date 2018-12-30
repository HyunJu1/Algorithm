import java.util.Scanner;

public class Q2072_홀수만더하기 {
	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int arr[][] = new int[x][10];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < x; i++) {
			int sum = 0;
			for (int j = 0; j < 10; j++) {

				if (arr[i][j] % 2 == 1) {
					sum = sum + arr[i][j];
				}

			}
			System.out.println("#" + (i+1)+" " + sum);

		}
	}

}
