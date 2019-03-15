package Day3;
import java.util.Scanner;

public class Q1979_어디단어 {

	//for문에서 break문 쓰는거 조심하자!!!!!
	
	
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int arrLen = sc.nextInt();
			int strLen = sc.nextInt();

			int arr[][] = new int[arrLen][arrLen];
			for (int j = 0; j < arrLen; j++) {
				for (int k = 0; k < arrLen; k++) {
					arr[j][k] = sc.nextInt();
				}
			}
			
			
			int result = 0;
			// Horizontal
			for (int j = 0; j < arrLen; j++) {
				int cnt = 0;
				for (int k = 0; k < arrLen; k++) {
					
				
					if (arr[j][k] != 1) {
						if (cnt == strLen) {
							result += 1;
						}
						cnt = 0;
						

					} else {
						cnt += 1;
					}

				}
			
				

				if (cnt == strLen) {

					result += 1;
				}
			}
			// Vertical
			for (int j = 0; j < arrLen; j++) {
				int cnt = 0;
				for (int k = 0; k < arrLen; k++) {
					// System.out.println("cnt2:"+cnt);
					if (arr[k][j] != 1) {
						if (cnt == strLen) {
							result += 1;
						}
						cnt = 0;
						

					} else {
						cnt += 1;
					}
				}
				if (cnt == strLen) {
					result += 1;
				}

			}

			System.out.println("#" + (i + 1) + " " + result);
		}
	}
}