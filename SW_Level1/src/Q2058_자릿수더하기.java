import java.util.Scanner;

public class Q2058_�ڸ������ϱ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		String xx=Integer.toString(x);
		int sum=0;
		for (int i=0;i<xx.length();i++ ) {
			// �� �ڸ����� ���ϰ� ���� �� charAt�� �� ����, Character.toString���� String��ȯ �Ŀ� Integer�� ��ȯ ��������Ѵ�.
			sum=sum+Integer.parseInt(Character.toString(xx.charAt(i)));
		}
		System.out.println(sum);
	}

}
