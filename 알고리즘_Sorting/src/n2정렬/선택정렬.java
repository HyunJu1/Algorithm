package n2정렬;

public class 선택정렬 {
	public int[] selectionSort(int [] A, int n) {
		for(int last=n-1; last>=2; last--) {
			int k= theLargest(A,last);
			int temp = A[k];
			A[k]=A[last];
			A[last]=temp;
		}
		return A;
	}

	public int theLargest(int[] A, int last) {
		int largest=1;
		for(int i=2; i<=last; i++) {
			if(A[i]>A[largest]) {
				largest=i;
			}
		}
		return largest;
	}
	public static void main(String args[]) {
		선택정렬 s = new 선택정렬();
		int arr[]= {1,6,7,4,6};
		int arr2[]=s.selectionSort(arr,arr.length);
		for(int i=0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}
