package seventh;

import java.util.Scanner;

public class ���̾��_1748 {
	// �̷��� �ߴ��� �ð��ʰ��� �ȶ�
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
