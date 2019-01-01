package Day3;
import java.util.HashMap;
import java.util.Scanner;

public class Q1946_압축풀기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();

		for (int h = 0; h < y; h++) {
			int x = sc.nextInt();
			String keyArr[]=new String [x];
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < x; i++) {
				keyArr[i]=sc.next();
				map.put(keyArr[i], sc.nextInt());

			}
			
			System.out.println("#" + (h + 1));
			int cnt = 0;
			for (int i=0; i<keyArr.length;i++) {
				for (int j = 0; j < map.get(keyArr[i]); j++) {
					System.out.print(keyArr[i]);
					cnt += 1;
	
					if (cnt%10==0) {
						
						System.out.println();
					}
				}

			}
			System.out.println();

		}

	}

}
