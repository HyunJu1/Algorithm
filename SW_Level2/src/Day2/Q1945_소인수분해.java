package Day2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q1945_소인수분해 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int arr[] = new int[x];

		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}
		int arr2[] = new int[5];
		Arrays.fill(arr2, 0); // 배열을 0으로 초기화

		// (int)Math.sqrt(n);
		for (int i = 0; i < x; i++) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(2, 0);
			map.put(3, 0);
			map.put(5, 0);
			map.put(7, 0);
			map.put(11, 0);
			
			int tmp = arr[i];
			
			for(int div=2; tmp>1; div++) {
				while(tmp%div==0) {
					map.put(div, map.get(div) + 1);
					tmp/=div;
					
				}
			
			}
			//Map내용 전체 출력
			System.out.print("#" + (i + 1) + " ");
			for ( int key : map.keySet() ) {
			    System.out.print( map.get(key)+" ");
			}
			System.out.println();

		}
	}

}
