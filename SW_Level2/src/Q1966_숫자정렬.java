import java.util.Scanner;

public class Q1966_숫자정렬 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for(int i=0; i<x; i++) {
			int tmp = sc.nextInt();
			int arr[]= new int[tmp];
			for(int j=0; j<tmp;j++) {
				arr[j]=sc.nextInt();
			}
			
			for(int j = 0 ; j < arr.length ; j ++) {
				for(int k = 0 ; k < arr.length -j -1 ; k ++) {
					if(arr[k]>arr[k+1]) {
						int temp = arr[k];
						arr[k] = arr[k+1];
						arr[k+1] = temp;
					}
				}
			}
			
			System.out.print("#" + (i + 1) + " ");
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
	
}
