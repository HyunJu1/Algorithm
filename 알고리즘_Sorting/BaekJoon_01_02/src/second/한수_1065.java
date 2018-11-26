package second;

import java.util.Scanner;

public class ÇÑ¼ö_1065 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int [4];
		int tot=0;
	
		for(int i=1; i<n; i++) {
			if(i<100) {
				tot++;
			}	
			else {
			int k=0;  int t=i;
			while(t>0) {
				a[k]=t%10;
				t/=10;k++;
			}
				if(a[0]-a[1]==a[1]-a[2]) {
					tot++;
				}
			}
		}

		System.out.println(tot);
		
	}
}
