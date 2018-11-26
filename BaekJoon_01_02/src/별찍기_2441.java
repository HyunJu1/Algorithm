import java.util.Scanner;

public class º°Âï±â_2441 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int j;
	int n= sc.nextInt();
	for(int i=0; i<n; i++) {
		for ( j=n; j>n-i;j--) {
			
		System.out.print(" ");
	}
		for (int k=n-j; k<n;k++) {
			System.out.print("*");
		}
	System.out.println();
}
}
}

