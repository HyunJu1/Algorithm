import java.util.Scanner;

public class Q2058_자릿수더하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		String xx=Integer.toString(x);
		int sum=0;
		for (int i=0;i<xx.length();i++ ) {
			// 각 자릿수를 더하고 싶을 때 charAt을 한 다음, Character.toString으로 String변환 후에 Integer로 변환 시켜줘야한다.
			sum=sum+Integer.parseInt(Character.toString(xx.charAt(i)));
		}
		System.out.println(sum);
	}

}
