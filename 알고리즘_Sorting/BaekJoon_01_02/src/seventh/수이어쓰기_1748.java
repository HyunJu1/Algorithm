package seventh;

import java.util.Scanner;

public class 수이어쓰기_1748 {
	// 이렇게 했더니 시간초과가 안뜸
	public static void main(String args[]) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			sum = sum + Integer.toString(i).length();
		}
		System.out.println(sum);
	}
}
