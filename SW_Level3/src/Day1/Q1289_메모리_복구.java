package Day1;

/*
 * ���簡 ��ǻ�͸� �����ٰ� �Ǽ��� �������� ���Ҵ�. �޸𸮰� �ʱ�ȭ�� ���̴�.

������ ���� �޸𸮰� ���� ���̾����� �˰� �־��� ����� �ٷ� ���� ������ �ǵ������� ������ �޸� ���� �ٲ� �� �� ������ �����.

�޸� bit�� �ϳ��� ��� 0���� 1���� �����ϸ� �ش� ���� �޸��� ������ ������ ���̴�.

���� ��� ���� �޸� ���� 0100�̰�, 3��° bit�� ��� 1�� �����ϸ� 0111�� �ȴ�.

���� ���°� �־��� �� �ʱ�ȭ ���� (��� bit�� 0) ���� ���� ���·� ���ư��µ� �ּ� �� ���̳� ���ľ� �ϴ��� ����غ���.

 */
import java.util.Scanner;

public class Q1289_�޸�_���� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			int cnt = 0;

			String input_str = sc.next();
			// ù��° 1
			int index = input_str.indexOf("1");
			if(index!=-1) {
				cnt+=1;
			}
			for (int j = index; j < input_str.length()-1; j++) {

				if(input_str.charAt(j)!=input_str.charAt(j+1)) {
					cnt+=1;
				}
			}
			
			System.out.println("#" + (i + 1) + " " + cnt);

		}
	}

}
