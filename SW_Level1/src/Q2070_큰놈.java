import java.util.Scanner;

public class Q2070_Å«³ð {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String arr[] =new String [x];
		for (int i = 0; i < x; i++) {

			int a= sc.nextInt();
			int b= sc.nextInt();
			
			if(a>b) 
				arr[i]=">";
			
			else if (a==b) 
				arr[i]="=";
			else
				arr[i]="<";
		
			
		}	
		for (int i=0; i<x; i++) {
			System.out.println("#" + (i+1)+" " + arr[i]);
		}

	}

}
