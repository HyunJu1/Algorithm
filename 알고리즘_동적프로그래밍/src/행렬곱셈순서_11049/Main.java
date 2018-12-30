package Çà·Ä°ö¼À¼ø¼­_11049;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Çà·Ä°ö¼À¼ø¼­_11049
public class Main {
	public  int min(int m1, int m2) {
		if (m1 == 0)
			return  m2;
		else if (m2 == 0)
			return  m1;
		else if (m1 < m2)
			return m1;
		else
			return m2;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main m = new Main();
		int x = Integer.parseInt(br.readLine());
		int arr1[][],arr2[][];
		
		arr1 = new int[x][2];
		arr2 = new int[x][x];
		for (int i = 0; i < x; i++) {
			String[] s = br.readLine().split(" ");
			arr1[i][0] = Integer.parseInt(s[0]);
			arr1[i][1] = Integer.parseInt(s[1]);
		}
		for (int i = 2; i <= x; i++) {
			int y = x - i;
			for (int start = 0; start <= y; start++) {
				int end = start + i - 1;
				for (int k = start; k < start + i - 1; k++) {
					arr2[start][end] = (int) m.min(
							arr2[start][k] + arr2[k + 1][end] + (arr1[start][0] * arr1[k][1] * arr1[end][1]),
							arr2[start][end]);
				}
			}
		}
		System.out.print(arr2[0][x - 1]);
	}

}