package LCS1_9251;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//LCS1_9251
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String x, y;
		int x_length, y_length;
		x = br.readLine();
		y = br.readLine();
		x_length = x.length();
		y_length = y.length();
		int arr[][] = new int[x_length + 1][y_length + 1];
		
		for (int i = 1; i <= x_length; i++) {
			for (int j = 1; j <= y_length; j++) {
				
				if (x.charAt(i - 1) == y.charAt(j - 1))
					arr[i][j] = arr[i - 1][j - 1] + 1;
				else
					arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
			}
			
		}
		System.out.println(arr[x_length][y_length]);
	}
}