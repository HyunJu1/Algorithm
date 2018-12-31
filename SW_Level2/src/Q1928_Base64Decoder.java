import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Scanner;

public class Q1928_Base64Decoder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String arr[] = new String[x];

		for (int i = 0; i < x; i++) {
			arr[i] = sc.next();
		}

		for (int i = 0; i < x; i++) {
			byte[] targetBytes = arr[i].getBytes();
			// Base64 µðÄÚµù //
			Decoder decoder = Base64.getDecoder();
			byte[] decodedBytes = decoder.decode(targetBytes);

			System.out.println("#" + (i + 1) + " " + new String(decodedBytes));

		}
	}
}
