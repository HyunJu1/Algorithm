import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q1983_�������� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String grade[] = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };

		for (int i = 0; i < x; i++) {
			String result = "";
			int num = sc.nextInt();
			int studentNum = sc.nextInt();
			ArrayList<Double> arr = new ArrayList<>();
			ArrayList<Double> tmpArr = new ArrayList<>();

			for (int j = 0; j < num; j++) {

				// String stgrade[] = new String[num];

				int score1 = sc.nextInt();
				int score2 = sc.nextInt();
				int score3 = sc.nextInt();

				double total = score1 * 0.35 + score2 * 0.45 + score3 * 0.2;

				arr.add(total);
			}
			//call By Reference�Ӽ����� ���� ���� ������ ������ �ÿ� �ݵ�� addAll !
			tmpArr.addAll(arr);
//			
			Collections.sort(tmpArr);

//			for (Object object : arr) {
//
//				System.out.print("  "+object );
//
//			}
//
//			System.out.println("/////////////");
//			for (Object object : tmpArr) {
//
//				System.out.print("  "+object );
//
//			}
			double tmp = arr.get(studentNum-1);
			// System.out.println(tmp);

			int ��� = tmpArr.size()-tmpArr.indexOf(tmp)-1;

			int cnt = num /10 ;
			result = grade[(int)(��� /cnt)];
			//System.out.println("����:"+tmp+" ���:"+���+" NUM: "+num+" RESULT:"+result);
			System.out.println("#" + (i + 1) + " " + result);

		}
	}

}
