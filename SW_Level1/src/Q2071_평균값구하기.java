import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q2071_평균값구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(br.readLine());

		String arr[][] = new String[x][10];

		for (int i = 0; i < x; i++) {
			String xx = br.readLine();
			
				arr[i] = (xx.split(" "));
			
		}

		for (int i = 0; i < x; i++) {
			int sum=0;
			for (int j = 0; j < 10; j++) {
				
				
				sum=sum+Integer.parseInt(arr[i][j]);
				
				}
			double avg = (double)sum/10;
			
			System.out.println("#" + (i+1)+" " + Math.round(avg));

			}

		}
	}


