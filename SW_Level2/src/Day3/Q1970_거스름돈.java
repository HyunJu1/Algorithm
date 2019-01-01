package Day3;
import java.util.Arrays;
import java.util.Scanner;

public class Q1970_°Å½º¸§µ· {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int moneyArr[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		
		for (int i = 0; i < x; i++) {
			int arr[] = new int[8];
			Arrays.fill(arr, 0);
			
			int money = sc.nextInt();

			int j = 0;
			while (money >= 0 && j<=7 )  {
				int count = (money / moneyArr[j]);
				if (count==0){
					j+=1;				
				}
				else {

				money -= moneyArr[j] * count;
				arr[j] += count;
				j += 1;}
			}
			System.out.println("#" + (i + 1) + " ");
			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}

	}
}
