package fifth;

import java.util.Scanner;

public class ¹æ¹øÈ£_1475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < x.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (String.valueOf(x.charAt(i)).equals(String.valueOf(arr[j]))) {
				
					arr2[j] += 1;
					
				}
			}
		}
		
		arr2[6]=(int) Math.ceil(((double)(arr2[6]+arr2[9])/2));
		arr2[9]=0;
		
		int max = 0;
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i]>max) {
				max=arr2[i];
			}
		}
		System.out.println(max);
	}
}
