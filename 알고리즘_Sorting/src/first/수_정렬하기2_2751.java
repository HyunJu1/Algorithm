package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class 수_정렬하기2_2751 {

    private static void quickSort(int[] A, int left, int right) {
       
        if(left<right) {
            int newPivot = partition(A,left,right);
            quickSort(A,left,newPivot-1); //피봇 왼쪽 정렬
            quickSort(A,newPivot+1,right);
        }
    }
    public static int partition(int A[], int left, int right) {
           
        int pivot = A[(left + right) / 2];
       
        while (left < right) {
            while ((A[left] < pivot) && (left < right))
                left++;
            while ((A[right] > pivot) && (left < right))
                right--;
       
            if (left < right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
            }
        }
       
        return left;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
     
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine().trim());
    int arr[] = new int[N];
     
    for(int i=0;i<N;i++) {
        arr[i] = Integer.parseInt(br.readLine().trim());
    }
    quickSort(arr,0,N-1);
     
    for(int i=0;i<N;i++)
        sb.append(arr[i]+"\n");
     
    System.out.println(sb);
     
    }
 
     
}