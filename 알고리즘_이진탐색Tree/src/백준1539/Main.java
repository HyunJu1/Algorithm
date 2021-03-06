package 백준1539;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
	private int height[];
	private static ArrayList<Integer> arr = new ArrayList<>();

	public int lowerBound(ArrayList<Integer> arr, int first, int end, int key) {
		// lower bound는 찾고자 하는 값 이상이 처음 나타나는 위치
		int middle;
		while (first < end) {
			middle = (first + end) / 2;
			if (arr.get(middle) < key)
				first = middle + 1;
			else
				end = middle;

		}
		return end;
	}

	public int getHeight(int node) {
		int a, left, right;
		int size = arr.size();
		a = lowerBound(arr, 0, size, node);
		left = a > 0 ? height[arr.get(a - 1)] : 0;
		right = a < size ? height[arr.get(a)] : 0;

		height[node] = Math.max(left, right) + 1;
		arr.add(a, node);
		return height[node];
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main m = new Main();
		int sum = 0;
		int n = Integer.parseInt(br.readLine());
		m.height = new int[n];
		for (int i = 0; i < n; i++) {
			sum += m.getHeight(Integer.parseInt(br.readLine()));
		}
		System.out.println(sum);

	}

}