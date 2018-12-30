import java.util.ArrayList;
import java.util.Scanner;

public class Q1933_N¾à¼ö {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		ArrayList arr = new ArrayList<>();
		for (int i = 1; i <= x; i++) {
			if (x % i == 0)
				arr.add(i);

		}

		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}

	}

}
