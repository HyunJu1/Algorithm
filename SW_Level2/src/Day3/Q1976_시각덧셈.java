package Day3;

import java.util.Scanner;

public class Q1976_½Ã°¢µ¡¼À {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {

			int Ahour = sc.nextInt();
			int Aminute = sc.nextInt();
			int Bhour = sc.nextInt();
			int Bminute = sc.nextInt();

			int ResultHour = 0, ResultMinute = 0;

			int minuteSum = Aminute + Bminute;
			if (minuteSum > 60) {
				ResultHour += 1;
				ResultMinute = minuteSum - 60;

			} else {
				ResultMinute = Aminute + Bminute;
			}
			
			int hourSum=Ahour+Bhour;
			if(hourSum>12) {
				ResultHour=ResultHour+hourSum-12;
			}
			else {
				ResultHour=ResultHour+Ahour+Bhour;
			}
			System.out.println("#" + (i + 1) + " "+ResultHour+" "+ResultMinute);
		}

	}

}
