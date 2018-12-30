import java.util.Scanner;

public class Q2029_몫과나머지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int arr[][]=new int[x][2];
		
		for (int i = 0; i < x; i++) {

			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			
			

			}
		for(int i=0; i<x; i++) {
			System.out.println("#" + (i+1)+" " + arr[i][0]/arr[i][1] +" "+arr[i][0]%arr[i][1] );
		}
		
		}
		
		
	}


