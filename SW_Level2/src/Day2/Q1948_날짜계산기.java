package Day2;
import java.util.Scanner;

public class Q1948_날짜계산기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int date[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < x; i++) {
			int diff = 0;

			int Amonth = sc.nextInt();
			int Aday = sc.nextInt();
			int Bmonth = sc.nextInt();
			int Bday = sc.nextInt();

			if (Amonth == Bmonth) {
				diff = Bday - Aday + 1;
			} else {
				diff = (date[Amonth - 1] - Aday) + Bday+1;

				for (int j = Amonth; j < Bmonth-1; j++) {
					diff += date[j];
				}
			}			
			System.out.println("#" + (i + 1) + " "+diff);
		}
	}
}