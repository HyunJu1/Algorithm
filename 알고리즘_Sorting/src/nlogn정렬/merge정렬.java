package nlogn정렬;


public class merge정렬 {
	int arr[]= {9,6,7,4,6};
	public void mergeSort(int[] A, int p, int r) {
		int q ;
		if (p < r) {
			q= (p + r) / 2;
			mergeSort(A, p, q);
			mergeSort(A, q + 1, r);
			merge(A, p, q, r);

		}
	}

	public void merge(int []A, int p, int q, int r) {
		int i=p;
		int j=q+1;
		int t=0;
		int tmp[]=new int[arr.length];
		while(i<=q && j<=r) {
			if(A[i]<=A[j]) {
				tmp[t++]=A[i++];
				
			}else {
				tmp[t++]=A[j++];
			}
		}
		while(i<=q) {
			tmp[t++]=A[i++];
			
		}
		while(j<=r) {
			tmp[t++]=A[j++];
		}
		i=p;t=0;
		while(i<=r) {
			A[i++]=tmp[t++];
		}
		
		
	}
	public static void main(String args[]) {
		merge정렬 s = new merge정렬();
		
	    s.mergeSort(s.arr,0,s.arr.length-1);
		for(int i=0; i<s.arr.length;i++) {
			System.out.println(s.arr[i]);
		}
	}
}
