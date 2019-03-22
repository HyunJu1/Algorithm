package Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1230_¾ÏÈ£¹®3 {

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
