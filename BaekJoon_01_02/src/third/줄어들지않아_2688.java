package third;

import java.util.ArrayList;
import java.util.Scanner;

public class �پ�����ʾ�_2688 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int x;
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		for (int i = 1; i <= n; i++) {
//			x = sc.nextInt();
//			arr.add(x);
//		}
//		
//		int sum = 0;
//		int arr2[] = new int[4];
//		for (int i = 1; i < 1000; i++) {
//
//		}
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), n, i, k; // t�� text Ƚ��.
		long d[][] = new long[65][10];
		while(t-->0) {
			n=sc.nextInt();// n�� ���� ����ڰ� �Է�.
			for(i=0; i<10; i++)d[1][i] = i + 1; //1�ڸ����ΰ��.
			for(i=2; i<=n; i++) {
				d[i][0] = 1; //��� i�ڸ��� 0���� ������ ���� 1��.
				for(k =1; k<10; k++)//1�� ������ �� ���.
					d[i][k] = d[i-1][k] + d[i][k -1];
			}
			System.out.println(d[n][9]);
		}
	}


}
