package Day2;
import java.util.Scanner;

public class Q1989_회문검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String arr[] = new String[x];

		for (int i = 0; i < x; i++) {
			arr[i] = sc.next();

		}
		
		for (int i = 0; i < x; i++) {
			boolean xx = false;
			for (int j = 0; j < arr[i].length(); j++) {
				int leng = arr[i].length() - 1;
				if (arr[i].charAt(j) != arr[i].charAt(leng - j)) {
					xx = true;

				}

			}

			if (xx == true) {

				System.out.println("#" + (i + 1) + " 0");
			} else {
				System.out.println("#" + (i + 1) + " 1");
			}

		}

	}
}
