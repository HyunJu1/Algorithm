package fourth;

import java.util.Scanner;

public class 단어공부_1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toUpperCase();
		char arr[] = new char[26];
		int count[] = new int[26];

		for (int i = 0; i < 26; i++) {
			arr[i] = (char) ('A' + i);
		}

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < 26; j++) {
				if (arr[j] == str.charAt(i)) {
					count[j] += 1;
				}
			}
		}
		int max = 0;

		for (int k = 0; k < 26; k++) {
			if (count[k] > count[max]) {
				max = k;
			}

		}
		int cnt = 0;
		for (int h = 0; h < 26; h++) {
			if (count[h] == count[max]) {
				cnt++;
			}
		}
		if (cnt == 1) {
			System.out.println(arr[max]);

		} else {
			System.out.println("?");
		}

	}
}
