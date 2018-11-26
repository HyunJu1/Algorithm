package third;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ∫Œ≥‡»∏¿Â_2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int y;
		for (int i = 1; i <= n; i++) {

			x = sc.nextInt();
			y = sc.nextInt();
			map.put(x, y);
		}
		int arr[][] = new int[15][15];


		for (int i = 0; i <= 14; i++) {
			arr[0][i] = i;
		}
		for (int i = 1; i <= n; i++) {
			int sum=0;
			for (int j = 1; j <= 14; j++) {

					sum=sum+arr[i-1][j];
				arr[i][j] = sum;
			}

		}
		
//		for (int i = 0; i <= n; i++) {
//			for (int j = 1; j <= 14; j++) {
//		
//				System.out.println(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

	
	 Set<Entry<Integer, Integer>> set = map.entrySet();
	 Iterator<Entry<Integer, Integer>> it = set.iterator();
	 while (it.hasNext()) {
	 Map.Entry<Integer, Integer> e = (Map.Entry<Integer, Integer>)it.next();
	 System.out.println(arr[e.getKey()][e.getValue()] );
	 }
	 
	}
}
