package fourth;

import java.util.Scanner;

public class hello {
	
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=10;i++) {
			sum+=i;
		}
		System.out.print("1���� 10������ ��  = ");
		System.out.println(sum);
		
		System.out.println("���ڸ� �Է��Ͻÿ�:");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum2=0;
		for(int i=1; i<=n;i++) {
			sum2+=i;
		}
		System.out.print("1���� "+n+"������ �� = ");
		System.out.println(sum2);
		
	}

}
