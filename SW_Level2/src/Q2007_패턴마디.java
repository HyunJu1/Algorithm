import java.util.Scanner;

public class Q2007_패턴마디 {

	public static void main(String[] args) {
		//입력 조건 : 한 글자를 두 번 이상 연속으로 입력하지 않는다 .
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String arr[] = new String[x];

		for (int i = 0; i < x; i++) {
			arr[i] = sc.next();

		}
		for (int i = 0; i < x; i++) {
			
			String s = arr[i];
			int tmp=0;
			for (int j = 1; j < s.length()/2; j++) {
				if(s.substring(0, j).equals(s.substring(j,2*j))){
					tmp=j;
					break;
				}
				
			}
			
			System.out.println("#" + (i + 1) + " "+tmp);
		}

		
	}

}
