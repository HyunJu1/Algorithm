package Day2;
import java.util.Scanner;

public class Q1926_369∞‘¿” {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
	for(int i=1; i<=x; i++) {
		String s = Integer.toString(i);
		
		boolean tmp= false;
		for (int j=0; j<s.length();j++) {
			if(s.charAt(j)=='3' || s.charAt(j)=='6' || s.charAt(j)=='9' ) {
				System.out.print("-");
				tmp=true;
			}
	
		}
		
		if(tmp==false) {
			System.out.print(s+" ");
		}else {
			System.out.print(" ");
		}
	}
	}
}
