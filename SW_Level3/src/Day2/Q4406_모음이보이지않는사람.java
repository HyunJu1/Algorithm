package Day2;

import java.util.Scanner;

public class Q4406_�����̺������ʴ»�� {

	/*
	 * �̰� ���������� Level1 ����. ���ĺ� �ҹ��� ������ �̷���� �ܾ ����� � ������ ���� �ɱ�? ���ĺ����� ������ ��a��,
	 * ��e��, ��i��, ��o��, ��u���� �ټ������� ���� ��� ��congratulation���̶�� �ܾ ����� ���� �Ǹ�
	 * ��cngrtltn������ �ν��ϰ� �� ���̴�.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		String remove[] = { "a", "e", "i", "o", "u" };
		for (int i = 0; i < num; i++) {
			String x = sc.next();

			for (int j = 0; j < remove.length; j++) {
				x = x.replaceAll(remove[j], "");
			}
			System.out.println("#" + (i + 1) + " " + x);

		}

	}

}
