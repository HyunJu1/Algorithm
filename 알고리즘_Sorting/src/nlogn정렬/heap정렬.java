package nlogn정렬;

public class heap정렬 {
	int arr[] = { 5, 6, 7, 4, 10 };

	public int[] heapSort(int[] A, int n) {
		buildHeap(A, n);
		for (int i = n; i >= 2; i--) {
			int temp = A[1];
			A[1] = A[i];
			A[i] = temp;

			heapify(A, 1, i - 1);
		}
		return A;
	}

	public void buildHeap(int A[], int n) {
		for (int i = n / 2; i >= 1; i--) {
			heapify(A, i, n);
		}
	}

	public void heapify(int A[], int k, int n) {
		int left = 2 * k;
		int right = 2 * k + 1;
		int smaller;
		if (right <= n) {
			if (A[left] < A[right]) {
				smaller = left;
			} else {
				smaller = right;
			}
		} else if (left <= n) {
			smaller = left;
		} else {
			return;
		}
		if (A[smaller] < A[k]) {
			int temp = A[k];
			A[k] = A[smaller];
			A[smaller] = temp;
			heapify(A, smaller, n);
		}

	}

	public static void main(String args[]) {
		heap정렬 s = new heap정렬();

		int[] arr2 = s.heapSort(s.arr, s.arr.length - 1);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
