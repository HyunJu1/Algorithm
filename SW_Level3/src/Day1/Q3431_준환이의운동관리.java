package Day1;

import java.util.Scanner;

/*
�ֱ� �浵�� ������ ���� ��ȯ�̴� ������ ���� �����ϱ� ���Ͽ� 1���Ͽ� L�� �̻� U�� ������ ��� �Ͽ��� �Ѵ�.

��ȯ�̴� �̹� �ֿ� X�и�ŭ ��� �Ͽ���.

����� ��ȯ�̰� ���ѵǾ� �ִ� �ð��� ���� ��� �� ������, �װ��� �ƴ϶�� �� �� �� ��� �ؾ� ������ ���� �� �ִ��� ����ϴ� ���α׷��� �ۼ��ؾ� �Ѵ�.


[�Է�]

ù ��° �ٿ� �׽�Ʈ ���̽��� �� T�� �־�����.

�� �׽�Ʈ ���̽��� ù ��° �ٿ��� �� ���� L, U, X(0�� L �� U �� 107, 0 �� X �� 107)�� �������� ���еǾ� �־�����.


[���]

�� �׽�Ʈ ���̽����� I�� �ʿ��� �纸�� �� ���� ��� �ϰ� �ִٸ� -1�� ����ϰ�, �ƴ϶�� �߰��� �� ���� �� ��ؾ� �ϴ��� ����Ѵ�.

*/
public class Q3431_��ȯ���ǿ���� {

	private static int calculate(int l, int u, int x) {
		
		
		if(x<l) {
			return l-x;
			
		}
		else if (x>l  && x<u) {
			return 0;
			
		}
		else {
			return -1;
		}
		
	}
		 
	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		for (int i=0; i<num; i++) {
		int L = sc.nextInt();
		int U = sc.nextInt();
		int X= sc.nextInt();
		
		
		
		int result= calculate(L,U,X);
		
		System.out.println("#"+i+1+" "+result);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
