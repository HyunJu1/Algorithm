package Day2;

import java.util.Scanner;

public class Q5601_�꽺������ {

	/*
	 * �̰� ���������� Level1 ����.
	 * 
	 * N���� ����� 1������ �꽺�� ������ ���� �ܿ� ���� ���ð��� �Ѵ�. �׷��� �ѻ���� ������ �й��ϴ� ���� �������� �ʱ� ������ ����
	 * ����� ���� �꽺�� ���� ���ñ�� �Ͽ���. ù��° ����� ���ϴ� ��ŭ ���� ������, �ι�° ����� ���ϴ� ��ŭ ���� ������, ...,
	 * N��° ����� ������ŭ ���� ������.
	 * 
	 * �� �� N��° ����� N���� �� �߿� �ϳ��� ��������, N-1��° ����� ���� �� �߿� �ϳ��� ��������, ���������� ù��° �����
	 * ���������� ���� ���� ��������.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int input = sc.nextInt();

			String result = " 1/" + Integer.toString(input);
			String result2 = "";
			for (int j = 0; j < input; j++) {
				result2 += result;

			}
			System.out.println("#" + (i + 1) + result2);

		}

	}

}
