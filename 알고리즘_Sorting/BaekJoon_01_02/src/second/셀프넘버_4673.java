package second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ¼¿ÇÁ³Ñ¹ö_4673 {
	public static void main(String[] args) {
		int n = 1;
		int m = 5;
		int z = 3;
		int i = 1;
		ArrayList arr = new ArrayList();

		for (n = 0; n <= 10000; n++) {
			int sum = n;
			sum += (n % 10) / 1;
			if (n >= 10) {
				sum += (n % 100) / 10;
				if (n >= 100) {
					sum += (n % 1000) / 100;
					if (n >= 1000) {
						sum += (n % 10000) / 1000;
						if (n == 10000) {
							sum += n / 10000;
						}
					}
				}
			}
			arr.add(sum);
		}

		for (int j = 1; j <= 10000; j++) {
			if (!arr.contains((int) j)) {
				System.out.println(j);
			}
		}
	}
}
