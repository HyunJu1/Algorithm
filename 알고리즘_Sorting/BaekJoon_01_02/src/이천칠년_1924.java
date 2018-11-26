import java.util.Scanner;

public class ÀÌÃµÄ¥³â_1924 {
public static void main(String args[]) {

	int x, y;
	Scanner sc = new Scanner(System.in);
	x = sc.nextInt();
	y = sc.nextInt();
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	int sum = 0;
	
	for(int i=0; i<x;i++) {
		sum=sum+month[i];
	}
	sum=sum+y;
	switch (sum % 7) {
	case 1:		System.out.println("MON");	break;
	case 2:		System.out.println("TUE");		break;
	case 3:		System.out.println("WED");		break;
	case 4:		System.out.println("THU");	break;	
	case 5:		System.out.println("FRI");		break;
	case 6:		System.out.println("SAT");		break;
	case 0:		System.out.println("SUN");		break;
	}		
	}
}
