import java.util.Scanner;

public class Q1936_1대1가위바위보 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x == 1) {
			if (y == 2)
				System.out.println("B");
			else
				System.out.println("A");
		} else if (x == 2) {
			if (y == 1)
				System.out.println("A");
			else
				System.out.println("B");

		} else {
			if (y == 1)
				System.out.println("B");
			else
				System.out.println("A");
		}

	}
}