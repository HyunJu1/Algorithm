package ����2957;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private static int BASE = 524288;
	private static int N, lcnt = 0, ucnt = 0, max = 0, num = 0, cnt=0;
	private static int[] maxtree = new int[BASE * 2], mintree = new int[BASE * 2], map = new int[BASE + 1];
	private static StringBuffer sb = new StringBuffer();
	
	public static void update(int index, int value) {
		for (index += BASE; index > 0; index /= 2) {
			maxtree[index] = Math.max(maxtree[index], value);
			mintree[index] = Math.min(mintree[index], value);
		}

		sb.append(cnt).append('\n');
	}

	public static int selectMax(int left, int right) {
		int value = 0;

		for (left += BASE, right += BASE; left <= right; left /= 2, right /= 2) {
			if (left % 2 == 1)
				value = Math.max(value, maxtree[left++]);

			if (right % 2 == 0)
				value = Math.max(value, maxtree[right--]);
		}

		return value;
	}

	public static int selectMin(int left, int right) {
		int value = Integer.MAX_VALUE;

		for (left += BASE, right += BASE; left <= right; left /= 2, right /= 2) {
			if (left % 2 == 1)
				value = Math.min(value, mintree[left++]);

			if (right % 2 == 0)
				value = Math.min(value, mintree[right--]);
		}

		return value == Integer.MAX_VALUE ? 0 : value;
	}
	public static void main(String[] args) throws IOException {
		Arrays.fill(mintree, Integer.MAX_VALUE);

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			N = Integer.parseInt(br.readLine());

			num = Integer.parseInt(br.readLine());
			update(num, num);

			for (int i = 2; i <= N; i++) {
				num = Integer.parseInt(br.readLine());
				lcnt = selectMax(1, num - 1 == 0 ? 1 : num - 1);
				ucnt = selectMin(num + 1, 300005);
				max = Math.max(map[lcnt], map[ucnt]) + 1;

				cnt += max;
				map[num] = max;
				update(num, num);
			}

			System.out.println(sb.toString());
		}
	}


}