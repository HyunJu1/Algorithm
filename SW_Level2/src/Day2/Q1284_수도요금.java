package Day2;
import java.util.Scanner;

public class Q1284_������� {

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
		int P = arr[i][0]; //A��  1L�� ���
		int Q = arr[i][1]; //B�� R���� ���� ���
		int R = arr[i][2]; 
		int S = arr[i][3]; //B�� 1L�� �߰���� 
		int W = arr[i][4]; //�Ѵ� ��� ���� ��
		
		
		if(R >= W) { //R���� ���� ����ߴٸ�
			min= Math.min(P*W, Q);
		}
		else { //R���� �ʰ� ��� �ߴٸ� 
			min= Math.min(P*W, Q + S*(W - R));
		}
		System.out.println("#" + (i + 1) + " "+min);
		}

	}

}
