import java.util.Scanner;

public class Q1940_RCī {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int y = sc.nextInt();

			int sum = 0;
			int veloSum = 0;

			for (int j = 0; j < y; j++) {
				int time = sc.nextInt();
				int velocity = 0;
				if (time != 0) {
					velocity = sc.nextInt();
				}

				switch (velocity) {
				case 0:
					sum += sum;
					break;
				case 1:
					sum += velocity;
					break;
				case 2:
					sum += velocity;
					break;
				default:
					break;
				}

			}
			System.out.println("#" + (i + 1) + " " + sum);
		}
	}
}
