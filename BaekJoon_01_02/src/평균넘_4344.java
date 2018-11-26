import java.util.Scanner;


public class Æò±Õ³Ñ_4344 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j;
		int x[][] = new int[n][];
		int m;
		int tot = 0;
		for (int i = 0; i < n; i++) {

			m = sc.nextInt();
			x[i] = new int[m];
			for (j = 0; j < m; j++) {

				x[i][j] = sc.nextInt();
			}
		}

		int avg[] = new int[x.length];

		for (int i = 0; i < x.length; i++) {
			tot = 0;
			for (int k = 0; k < x[i].length; k++) {
				int st = x[i][k];
				tot = tot + st;
			}
			avg[i] = tot / x[i].length;			
		}
		int num ;
		for (int i = 0; i < x.length; i++) {
			num=0;
			for (int k = 0; k < x[i].length; k++) {
				
				if (x[i][k] > avg[i]) {
					num++;
				}
			}

			double mmm=100*(double)num/(double)x[i].length;
			System.out.println(String.format("%.3f", mmm)+"%");
		}
	}
}