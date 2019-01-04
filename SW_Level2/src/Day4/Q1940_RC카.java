package Day4;
import java.util.Scanner;

public class Q1940_RCī {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int y = sc.nextInt();

			int sum = 0;

			int state = 0;
			int velocity = 0;
			int currentVelo = 0;
			for (int j = 0; j < y; j++) {
				state = sc.nextInt();

				if (state != 0) {
					velocity = sc.nextInt();
				}

				switch (state) {

				case 0:

					sum = sum + currentVelo;

					break;
				case 1:
					// System.out.println(state);
					currentVelo = currentVelo + velocity;
					sum = sum + currentVelo;
					// System.out.println(sum);
					break;
				case 2:

					currentVelo = currentVelo - velocity;
					if (currentVelo < 0) {
						currentVelo = 0;
					}
					sum = sum + currentVelo;
					// System.out.println(sum);
					break;
				default:
					// System.out.println(sum);
					break;
				}

			}

			System.out.println("#" + (i + 1) + " " + sum);
		}
	}
}
