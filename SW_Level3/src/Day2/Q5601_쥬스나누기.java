package Day2;

import java.util.Scanner;

public class Q5601_쥬스나누기 {

	/*
	 * 이건 실질적으로 Level1 문제.
	 * 
	 * N명의 사람이 1리터의 쥬스를 나누어 각자 잔에 따라서 마시고자 한다. 그런데 한사람이 따르고 분배하는 것은 공평하지 않기 때문에 다음
	 * 방법을 통해 쥬스를 나눠 마시기로 하였다. 첫번째 사람이 원하는 만큼 한잔 따르고, 두번째 사람이 원하는 만큼 한잔 따르고, ...,
	 * N번째 사람이 남은만큼 한잔 따른다.
	 * 
	 * 그 후 N번째 사람이 N개의 잔 중에 하나를 가져가고, N-1번째 사람이 남은 잔 중에 하나를 가져가고, 최종적으로 첫번째 사람이
	 * 마지막으로 남은 잔을 가져간다.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int input = sc.nextInt();

			String result = " 1/" + Integer.toString(input);
			String result2 = "";
			for (int j = 0; j < input; j++) {
				result2 += result;

			}
			System.out.println("#" + (i + 1) + result2);

		}

	}

}
