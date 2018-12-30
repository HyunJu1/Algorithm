import java.util.Scanner;


public class Q2063_Áß°£°ª {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int arr[] = new int[x];

		for (int i = 0; i < x; i++) {

			arr[i] = sc.nextInt();

		}
		for(int i = 0 ; i < arr.length ; i ++) {
			for(int j = 0 ; j < arr.length -i -1 ; j ++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(arr[x/2]);
	}

}
