package fifth;

import java.util.Scanner;

public class 단어의개수_1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char arr[] = new char[1000001];
		int count = 1;
		for (int i = 0; i < n.length(); i++) {
			arr[i] = n.charAt(i);
			if (arr[i] == ' ') {
				count++;
			}
		}
		if (arr[n.length() - 1] == ' ') {
			count--;
		}
		if (arr[0] == ' ') {
			count--;
		}
		System.out.println(count);

	}

}
