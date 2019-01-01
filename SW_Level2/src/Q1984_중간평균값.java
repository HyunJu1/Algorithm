import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q1984_Áß°£Æò±Õ°ª {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int max=0,min=10000, maxI=0, minI=0; 
			ArrayList<Integer> arr = new ArrayList<>();;
			for(int j=0; j<10;j++) {
			arr.add(sc.nextInt());
			}
			

	
			Collections.sort(arr);
			arr.remove(9);
			arr.remove(0);
			
			int sum=0;
			for(int j=0; j<arr.size();j++) {
				sum+=arr.get(j);
			}
			
			double avg = (double)sum/arr.size();
			System.out.println("#" + (i + 1) + " " + Math.round(avg));
		}

	}

}
