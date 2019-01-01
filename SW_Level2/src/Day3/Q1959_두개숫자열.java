package Day3;
import java.util.Scanner;

public class Q1959_두개숫자열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int h = 0; h < x; h++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int arrA[] = new int[a];
			int arrB[] = new int[b];
			for (int i = 0; i < a; i++) {
				arrA[i] = sc.nextInt();
			}
			for (int i = 0; i < b; i++) {
				arrB[i] = sc.nextInt();
			}

			int max = 0;
			int cnt = 0;
			
			int bigArr[], smallArr[];
			if(arrB.length>arrA.length) {
				bigArr=arrB;
				smallArr=arrA;
			}else {
				bigArr=arrA;
				smallArr=arrB;
			}
			
		
			for (int i = 0; i < bigArr.length - smallArr.length + 1; i++) {
				int tmpSum = 0;
				

				for (int j = 0; j < smallArr.length; j++) {
	

					tmpSum += smallArr[j] * bigArr[j + cnt];
				}
				//System.out.println(tmpSum);
				cnt += 1;
				// = arrA[0] * arrB[i] + arrA[1] * arrB[i + 1] + arrA[2] * arrB[i + 2];
				if (max < tmpSum) {
					max = tmpSum;
				}
			}

			System.out.println("#" + (h + 1) + " " + max);

		}

	}

}
