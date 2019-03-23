package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3314_보충학습 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num= sc.nextInt();
		
		for(int i=0; i<num; i++ ) {
			
			ArrayList<Integer> arr= new ArrayList<Integer>();
			
			for(int j=0; j<5;j++) {
				int input = sc.nextInt();
				
				if(input>=40) {
					arr.add(input);
					
				}
				else {
					arr.add(40);
				}
			}
			int sum=0;
			for(int j=0; j<5;j++) {
				sum+= arr.get(j);
			}
			
			System.out.println("#" + (i+1) + " " + sum/5);
		}
		
	}

}
