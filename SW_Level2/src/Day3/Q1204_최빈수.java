package Day3;
import java.util.HashMap;
import java.util.Scanner;

public class Q1204_최빈수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int h = 0; h < x; h++) {
			int i = sc.nextInt();

			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

			for (int j = 0; j < 1000; j++) {
				int tmpkey = sc.nextInt();
				//System.out.println(tmpkey);
				if (map.containsKey(tmpkey)) {
					map.put(tmpkey, map.get(tmpkey) + 1);
				}
				else {
					map.put(tmpkey, 0);
				}
			}

			int max = 0; // 빈도수
			int result = 0; // 가장 많은 빈도수의 키 값

			for (int key : map.keySet()) {

				if (max <= map.get(key)) {
					result = key;
					max = map.get(key);

				}

			}

			System.out.println("#" + (h + 1) + " " + result);
		}

	}
}