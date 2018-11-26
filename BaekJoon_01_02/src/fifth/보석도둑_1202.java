package fifth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class º¸¼®µµµÏ_1202 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int bosuk_num = sc.nextInt();
		int bag_num = sc.nextInt();
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < bosuk_num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			map.put(x, y);
		}
		int arr[] = new int[bag_num];
		for (int i = 0; i < bag_num; i++) {
			arr[i] = sc.nextInt();
		}

		// TreeMap sortedMap = new TreeMap(map);
		Iterator<Integer> keySetIterator = map.keySet().iterator();
		while (keySetIterator.hasNext()) {
			
			
			Integer key = keySetIterator.next();
			sum += map.get(key);
			
		}

		System.out.println(sum);

	}

}
