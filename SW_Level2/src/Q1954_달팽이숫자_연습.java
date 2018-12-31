import java.util.Scanner;

public class Q1954_달팽이숫자_연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		// int arr[] = new int[x];
		for (int i = 0; i < x; i++) {

			int a = sc.nextInt();
			int z = 0;
			for (int j = 1; j <= a; j++) {
				for (int k = 1; k <= a; k++) {
					if (j % 2 == 1) {
						System.out.print(z+" ");
						z += 1;
					} else {
						
						for(int itr=z+a-1;itr>z-1;itr--) {
						System.out.print(itr+" ");
						
						}
						z+=a;
						break;
					}
				}
				System.out.println();
			}

		}
	}

}
