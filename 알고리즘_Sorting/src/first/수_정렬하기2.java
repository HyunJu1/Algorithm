package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수_정렬하기2 {
	int arr[];

	public void mergeSort(int[] A, int p, int r) {
		int q;
		if (p < r) {
			q = (p + r) / 2;
			mergeSort(A, p, q);
			mergeSort(A, q + 1, r);
			merge(A, p, q, r);

		}
	}

	public void merge(int[] A, int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;
		int tmp[] = new int[arr.length];
		while (i <= q && j <= r) {
			if (A[i] <= A[j]) {
				tmp[t++] = A[i++];

			} else {
				tmp[t++] = A[j++];
			}
		}
		while (i <= q) {
			tmp[t++] = A[i++];

		}
		while (j <= r) {
			tmp[t++] = A[j++];
		}
		i = p;
		t = 0;
		while (i <= r) {
			A[i++] = tmp[t++];
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		수_정렬하기2 s = new 수_정렬하기2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine().trim());

		s.arr = new int[N];
		for (int i = 0; i < N; i++) {
			s.arr[i] = Integer.parseInt(br.readLine().trim());
		}
		s.mergeSort(s.arr, 0, N - 1);

		for (int i = 0; i < N; i++)
			sb.append(s.arr[i] + "\n");

		System.out.println(sb);

	}

}