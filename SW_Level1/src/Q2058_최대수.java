import java.util.Scanner;

public class Q2058_ÃÖ´ë¼ö {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int arr[][] = new int[x][10];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<x; i++) {
			int max=0;
			for( int j=0; j<10; j++) {
				if(arr[i][j]>max) {
					max= arr[i][j];
				}
			}
			System.out.println("#" + (i+1)+" " + max);

		}
		
		
		
		
		
	}

}
