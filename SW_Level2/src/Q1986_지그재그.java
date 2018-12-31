import java.util.Scanner;

public class Q1986_지그재그 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int arr[] = new int[x];

		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();

		}
		
		for(int i=0; i<x; i++) {
			int sum=0;
			
			for (int j=1; j<=arr[i]; j++) {
				if(j%2==1) {
					sum+=j;
				}
				else {
					sum-=j;
				}
			}
			
			System.out.println("#" + (i + 1) + " "+sum);
		}
	}

}
