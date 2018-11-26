package n2정렬;

public class 삽입정렬 {
 public int[] insertionSort(int A[], int n) {
	 for( int i=1; i<=n; i++) {
		 int loc=i-1;
		 int newItem=A[i];
		 
		 while( loc>=0 && newItem<A[loc]) {
			 A[loc+1]=A[loc];
			 loc--;
		 }
		 A[loc+1]=newItem;
		 
	 }
	 return A;
 }
	public static void main(String args[]) {
		삽입정렬 s = new 삽입정렬();
		int arr[]= {9,6,7,4,6};
	    arr=s.insertionSort(arr,arr.length-1);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
