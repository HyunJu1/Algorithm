package Day1;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * 0 ~ 999999 ������ ���� �����Ͽ� ���� ��ȣ���� �ִ�.

��ȣ���� ���� �����ؾ� �� ���� �߻��ߴµ�, �� ��ȣ���� Ư�� ���۵� ó����θ� ������ �����ϴ�.

�� ó����� ������ ���� 3���� ����� �����Ѵ�.
 
1. I(����) x, y, s : �տ������� x�� ��ġ �ٷ� ������ y���� ���ڸ� �����Ѵ�. s�� ������ ���ڵ��̴�.[ ex) I 3 2 123152 487651 ]

2. D(����) x, y : �տ������� x�� ��ġ �ٷ� �������� y���� ���ڸ� �����Ѵ�.[ ex) D 4 4 ]

3. A(�߰�) y, s : ��ȣ���� �� �ڿ� y���� ���ڸ� �����δ�. s�� ������ ���ڵ��̴�. [ ex) A 2 421257 796813 ]

���� ��Ģ�� �°� �ۼ��� ��ɾ �����Ͽ� ���� ���ڿ��� �־����� ��, ��ȣ���� �����ϰ�, ������ ����� ó�� 10�� ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͽ���.

 */
public class Q1230_��ȣ��3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			int num = sc.nextInt();

			ArrayList<Integer> arr = new ArrayList<Integer>();

			for (int j = 0; j < num; j++) {
				arr.add(sc.nextInt());
			}

			int comm_num = sc.nextInt();

			for (int j = 0; j < comm_num; j++) {

				String comm_alpha = sc.next();

				if (comm_alpha.equals("I")) {
					int x = sc.nextInt();
					int y = sc.nextInt();

					for (int l = 0; l < y; l++) {
						int s = sc.nextInt();
						arr.add(x + l, s);
					}

				} else if (comm_alpha.equals("D")) {
					int x = sc.nextInt();
					int y = sc.nextInt();

					for (int l = 0; l < y; l++) {
						arr.remove(x + 1);
					}

				} else if (comm_alpha.equals("A")) {
					int y = sc.nextInt();
					for (int l = 0; l < y; l++) {
						arr.add(sc.nextInt());
					}
				}

			}
			System.out.print("#" + (i + 1) + " ");
			for (int k = 0; k < 10; k++) {
				System.out.print(arr.get(k) + " ");
			}
			System.out.println();
		}
	}

}
