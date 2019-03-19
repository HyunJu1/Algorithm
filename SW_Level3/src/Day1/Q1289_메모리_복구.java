package Day1;

import java.util.Scanner;

public class Q1289_메모리_복구 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			int cnt = 0;

			String input_str = sc.next();
			// 첫번째 1
			int index = input_str.indexOf("1");
			if(index!=-1) {
				cnt+=1;
			}
			for (int j = index; j < input_str.length()-1; j++) {

				if(input_str.charAt(j)!=input_str.charAt(j+1)) {
					cnt+=1;
				}
			}
			
			System.out.println("#" + (i + 1) + " " + cnt);

		}
	}

}
