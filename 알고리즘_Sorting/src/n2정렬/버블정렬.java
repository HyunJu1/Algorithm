package n2����;

public class �������� {
	public int [] bubbleSort(int A[], int n) {
		for(int last=n-1; last>=2; last--) {
			boolean sorted=true;
			for(int i=0; i<=last-1;i++) {
				if(A[i]>A[i+1]) {
					int temp=A[i];
					A[i]=A[i+1];
					A[i+1]=temp;
					sorted=false;
				}
			}
			if(sorted==true) {
				return A;
			}
			
		}
		return A;
	}
	public static void main(String args[]) {
		�������� s = new ��������();
		int arr[]= {9,6,7,4,6};
	    arr=s.bubbleSort(arr,arr.length);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
