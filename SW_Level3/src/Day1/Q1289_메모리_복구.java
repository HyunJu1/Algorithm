package Day1;

/*
 * 원재가 컴퓨터를 만지다가 실수를 저지르고 말았다. 메모리가 초기화된 것이다.

다행히 원래 메모리가 무슨 값이었는지 알고 있었던 원재는 바로 원래 값으로 되돌리려고 했으나 메모리 값을 바꿀 때 또 문제가 생겼다.

메모리 bit중 하나를 골라 0인지 1인지 결정하면 해당 값이 메모리의 끝까지 덮어씌우는 것이다.

예를 들어 지금 메모리 값이 0100이고, 3번째 bit를 골라 1로 설정하면 0111이 된다.

원래 상태가 주어질 때 초기화 상태 (모든 bit가 0) 에서 원래 상태로 돌아가는데 최소 몇 번이나 고쳐야 하는지 계산해보자.

 */
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
