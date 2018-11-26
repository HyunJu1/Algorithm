package seventh;

import java.util.HashMap;
import java.util.Scanner;

public class 소수단어_2153 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int sum = 0;
		boolean isPrime = false;
		for (int i = 0; i <= 25; i++) {

			hashMap.put('a' + i, i + 1);

		}
		for (int i = 0; i <= 25; i++) {

			hashMap.put('A' + i, i + 27);

		}
		for (int i = 0; i < word.length(); i++) {
			sum = sum + hashMap.get(Integer.parseInt(Integer.toString(word.charAt(i))));
		}

		for (int i = 2; i < sum; i++) {
			if (sum == 1) {
				isPrime = true;
				break;
			}
			if (sum % i == 0) {
				isPrime = true;
				break;
			}
		}

		if (isPrime == true) {
			System.out.println("It is not a prime word.");
		} else {
			System.out.println("It is a prime word.");
		}
	}
}
