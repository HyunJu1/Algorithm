package Day2;
import java.util.Scanner;

public class Q1284_수도요금 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int arr[][] = new int[x][5];

		for (int i = 0; i < x; i++) {
			
			
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
				
			
			}
		}
	for (int i = 0; i < x; i++) {	
		int min= 0;
		int P = arr[i][0]; //A사  1L당 요금
		int Q = arr[i][1]; //B사 R리터 이하 요금
		int R = arr[i][2]; 
		int S = arr[i][3]; //B사 1L당 추가요금 
		int W = arr[i][4]; //한달 사용 수도 양
		
		
		if(R >= W) { //R리터 이하 사용했다면
			min= Math.min(P*W, Q);
		}
		else { //R리터 초과 사용 했다면 
			min= Math.min(P*W, Q + S*(W - R));
		}
		System.out.println("#" + (i + 1) + " "+min);
		}

	}

}
