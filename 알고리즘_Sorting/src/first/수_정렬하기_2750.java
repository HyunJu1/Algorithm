package first;

import java.util.Scanner;

import n2����.��������;

public class ��_�����ϱ�_2750 {

	// ��������

	public int[] selectionSort(int [] A, int n) {
		for(int last=n-1; last>=1; last--) {
			int k= theLargest(A,last);
			int temp = A[k];
			A[k]=A[last];
			A[last]=temp;
		}
		return A;
	}

	public int theLargest(int[] A, int last) {
		int largest=0;
		for(int i=0; i<=last; i++) {
			if(A[i]>A[largest]) {
				largest=i;
			}
		}
		return largest;
	}
	public static void main(String args[]) {
		��_�����ϱ�_2750 s = new ��_�����ϱ�_2750();
		Scanner sc = new Scanner(System.in);
		int tmp = sc.nextInt();
		int arr[] = new int[tmp];
		for (int i = 0; i < tmp; i++) {
			arr[i] = sc.nextInt();
		}
		int arr2[]=s.selectionSort(arr,tmp);
		for(int i=0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}
