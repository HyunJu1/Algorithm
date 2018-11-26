package fourth;

import java.util.Scanner;

public class hello {
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=10;i++) {
			sum+=i;
		}
		System.out.print("1부터 10까지의 합  = ");
		System.out.println(sum);
		
		System.out.println("숫자를 입력하시오:");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum2=0;
		for(int i=1; i<=n;i++) {
			sum2+=i;
		}
		System.out.print("1부터 "+n+"까지의 합 = ");
		System.out.println(sum2);
		
	}

}
