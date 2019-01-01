package Day2;
import java.util.HashMap;
import java.util.Scanner;

public class Q1928_불면증치료 {
	//내가 불면증 생길듯
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int arr[] = new int[x];
		for (int i = 0; i < x; i++) {

			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < x; i++) {

			int cnt = 1;
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(0, 0);
			map.put(1, 0);
			map.put(2, 0);
			map.put(3, 0);
			map.put(4, 0);
			map.put(5, 0);
			map.put(6, 0);
			map.put(7, 0);
			map.put(8, 0);
			map.put(9, 0);

			String str = Integer.toString(arr[i]);

			while (true) {

				if (map.containsValue(0) == false) {
					break;
				} else {
//					System.out.println("cnt # "+cnt);
//					System.out.println("str # "+str);
					
					str = Integer.toString(arr[i] * cnt);
					cnt += 1;
					for (int j = 0; j < str.length(); j++) {
						int key = Integer.parseInt(Character.toString(str.charAt(j)));

						map.put(key, map.get(key) + 1);
					}

				}
			}
			System.out.println("#" + (i + 1) + " " + str);
		}

	}

}
