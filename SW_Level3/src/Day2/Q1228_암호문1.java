package Day2;


import java.util.ArrayList;
import java.util.Scanner;
/*
 * 0 ~ 999999 사이의 수를 나열하여 만든 암호문이 있다.

암호문을 급히 수정해야 할 일이 발생했는데, 이 암호문은 특수 제작된 처리기로만 수정이 가능하다.

이 처리기는 다음과 같이 1개의 기능을 제공한다.
 
1. I(삽입) x, y, s : 앞에서부터 x의 위치 바로 다음에 y개의 숫자를 삽입한다. s는 덧붙일 숫자들이다.[ ex) I 3 2 123152 487651 ]

위의 규칙에 맞게 작성된 명령어를 나열하여 만든 문자열이 주어졌을 때, 암호문을 수정하고, 수정된 결과의 처음 10개 숫자를 출력하는 프로그램을 작성하여라.

 */
public class Q1228_암호문1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			int num = sc.nextInt();

			ArrayList<Integer> arr = new ArrayList<Integer>();

			for (int j = 0; j < num; j++) {
				arr.add(sc.nextInt());
			}

			int comm_num = sc.nextInt();

			for (int j = 0; j < comm_num; j++) {

				String comm_alpha = sc.next();

				if (comm_alpha.equals("I")) {
					int x = sc.nextInt();
					int y = sc.nextInt();

					for (int l = 0; l < y; l++) {
						int s = sc.nextInt();
						arr.add(x + l, s);
					}

				} 

			}
			System.out.print("#" + (i + 1) + " ");
			for (int k = 0; k < 10; k++) {
				System.out.print(arr.get(k) + " ");
			}
			System.out.println();
		}
	}

}
