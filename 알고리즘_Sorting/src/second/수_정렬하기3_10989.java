package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class 수_정렬하기3_10989 {

	public void radixsort(int[] arr) {
		int m = getMax(arr);
		for (int exp = 1; m / exp > 0; exp *= 10) {
			countSort(arr, exp);
		}
	}
	 public void countSort(int[] arr, int n) {
		int[] result = new int[arr.length];
		int[] cnt = new int[10];
		Arrays.fill(cnt, 0);


		for (int i = 0; i < arr.length; i++) {
			cnt[(arr[i] / n) % 10]++;
		}

		for (int i = 1; i < 10; i++) {
			cnt[i] += cnt[i - 1];
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			result[cnt[(arr[i] / n) % 10] - 1] = arr[i];
			cnt[(arr[i] / n) % 10]--;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = result[i];
		}
	}
	public int getMax(int[] arr) {
		int mx = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > mx) {
				mx = arr[i];
			}
		}
		return mx;
	}



	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine().trim());
		int data[] = new int[N];

		for (int i = 0; i < N; i++) {
			data[i] = Integer.parseInt(br.readLine().trim());
		}
		수_정렬하기3_10989 s=new 수_정렬하기3_10989();
		s.radixsort(data);

		for (int i = 0; i < N; i++)
			sb.append(data[i] + "\n");

		System.out.println(sb);

	}

}