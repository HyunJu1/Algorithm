package nlogn정렬;


public class quick정렬 {
	int arr[]= {1,6,7,4,6,9,10,5};
	public void quickSort(int[] A, int p, int r) {
		if (p < r) {
			int q = partition(A, p, r);
			quickSort(A, p, q - 1);
			quickSort(A, q + 1, r);

		}
		
	}
	public int partition(int[] A, int p, int r) {
		int x=A[r];
		int i=p-1;
		for(int j=p; j<=r-1; j++) {
			if(A[j]<=x) {
				int temp= A[++i];
				A[i]= A[j];
				A[j]=temp;
			}
		}
		int temp= A[i+1];
		A[i+1]=A[r];
		A[r]=temp;
		return i+1;
	}
	public static void main(String args[]) {
		quick정렬 s = new quick정렬();
		
	     s.quickSort(s.arr,0,s.arr.length-1);
		for(int i=0; i<s.arr.length;i++) {
			System.out.println(s.arr[i]);
		}
	}
}
