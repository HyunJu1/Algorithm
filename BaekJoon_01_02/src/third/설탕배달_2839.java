package third;

import java.util.Scanner;

public class ¼³ÅÁ¹è´Ş_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		if (n % 5 == 0) {
			sum = n / 5;
			System.out.println(sum);
		} else {
			int x=n/5;
			for(int i=x; i>0;i--) {
				int y = n-i*5;
				if(y%3==0) {
					int num3=y/3;
					System.out.println(num3+i);
					return;
				}
				else {
					continue;
				}
			}
			
			if (n % 3 == 0) {
				sum = n / 3;
			} else {
				sum = -1;
			}
			System.out.println(sum);
		}
		}
		
}
			

	