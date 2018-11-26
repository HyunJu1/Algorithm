package LCS_9252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static String x, y;
	private static int x_length, y_length;
	

    StringBuffer strBuffer = new StringBuffer(); 

	String result="";
	public StringBuffer get_Common_String(int[][] arr) {
		int xx = x_length;
		int yy = y_length;
		while (arr[xx][yy] != 0) {
			if (x.charAt(xx - 1) == y.charAt(yy - 1)) {
				result=result+(x.charAt(xx - 1));
				xx = xx - 1;
				yy = yy - 1;
			} else {
				if (arr[xx - 1][yy] > arr[xx][yy - 1]) {
					xx = xx - 1;
				} else {
					yy = yy - 1;
				}
			}
		}
		strBuffer.append(result);
		return strBuffer.reverse();
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main m = new Main();
		x = br.readLine();
		y = br.readLine();
		x_length = x.length();
		y_length = y.length();
		int arr[][] = new int[x_length + 1][y_length + 1];

		for (int i = 1; i <= x_length; i++) {
			for (int j = 1; j <= y_length; j++) {

				if (x.charAt(i - 1) == y.charAt(j - 1)) {
					arr[i][j] = arr[i - 1][j - 1] + 1;
				} else {
					arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
				}
			}

		}
		System.out.println(arr[x_length][y_length]);
		System.out.println(m.get_Common_String(arr));
	}

}