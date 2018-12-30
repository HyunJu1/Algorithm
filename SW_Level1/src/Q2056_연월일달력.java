import java.util.Scanner;

public class Q2056_연월일달력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String arr[] = new String[x];

		String tmp[] = new String[x];

		for (int i = 0; i < x; i++) {
			arr[i] = sc.next();

		}

		for (int i = 0; i < x; i++) {
			String s = arr[i];
			String month = s.substring(4, 6);
			String day = s.substring(6, 8);

			int intMonth=Integer.parseInt(month);
			int intDay=Integer.parseInt(day);
			
//			System.out.println(intMonth);
//			System.out.println(intDay);
			tmp[i]=s.substring(0,4)+"/"+month+"/"+day;
			
			if (intMonth >= 13 ||intMonth ==0 ) {
				tmp[i] = "-1";
				
			}
			if(intMonth==1||intMonth==3|| intMonth==5||intMonth==7||intMonth==8||intMonth==12||intMonth==10) {
				if(intDay>31)
					tmp[i] = "-1";
			}
			if(intMonth==4||intMonth==6|| intMonth==9||intMonth==11) {
				if(intDay>30)
					tmp[i] = "-1";
			}
			if (intMonth==2){
				if(intDay>28)
					tmp[i] = "-1";
			}
			
		
			System.out.println("#" + (i+1)+" " + tmp[i] );
		}
		
	}

}
