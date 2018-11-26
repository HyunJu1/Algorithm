package sixth;

import java.util.Scanner;

public class ÇÏ¾áÄ­_1100 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String row[] = new String[9];
		int cnt = 0;
		char col[][] = new char[9][9];
		for (int i = 1; i <= 8; i++) {
			row[i] = sc.next();
		}
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				col[i][j] = row[i].charAt(j - 1);
				if (i % 2 == j % 2) {
					if(col[i][j]=='F') {
						cnt++;
					}
				}
			}

		}
		System.out.println(cnt);

	}
}
