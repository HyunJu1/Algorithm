import java.util.Scanner;

public class ��������_11721 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		for (int i = 1; i < a.length(); i++) {

			System.out.print(a.charAt(i));

			if (i % 10 == 0) {
				System.out.println();
			}
		}

	}
}
