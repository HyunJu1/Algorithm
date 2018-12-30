import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2050_알파벳숫자변환 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String x = br.readLine();
		
		for(int i=0; i<x.length();i++) {
			System.out.print(Integer.parseInt(Integer.toString(x.charAt(i)))-64+" ");
		}

	}

}
