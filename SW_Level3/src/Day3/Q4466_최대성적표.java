package Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q4466_최대성적표 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			Descending descending = new Descending();

			int result = 0;

			int N = sc.nextInt();
			int K = sc.nextInt();

			for (int j = 0; j < N; j++) {
				arr.add(sc.nextInt());
			}
			Collections.sort(arr, descending);
			int sum=0;
			for(int j=0; j<K;j++) {
				//System.out.print(arr.get(j)+" ");
				sum+=arr.get(j);
			}
			
			
			System.out.println("#" + (i + 1) + " " + sum);
		}

	}
}
class Descending implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return arg1.compareTo(arg0);
	}
	
}
