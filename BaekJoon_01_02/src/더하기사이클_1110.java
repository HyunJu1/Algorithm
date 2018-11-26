import java.util.Scanner;

public class 더하기사이클_1110 {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int num2= num;
int x=0;
while(true) {
	int sum=num2/10 + num2%10;
	num2= num2%10*10 + sum%10;
	//System.out.println(num2);
	x++;
	if(num==num2) {
		break;
	}
}

System.out.println(x);

	}
}
