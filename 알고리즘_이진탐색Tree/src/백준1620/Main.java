package ����1620;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	HashMap<String, Integer> arr = new HashMap<String, Integer>();
	StringBuilder sb = new StringBuilder();
	String[] ar;

	public void checking(String s) {
		try {
			int a = Integer.parseInt(s);

			sb.append(ar[a-1]+"\n");
		} catch (Exception e) {

			sb.append(arr.get(s) + 1+"\n");
		}
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		Main m = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] N = br.readLine().split(" ");
		m.ar = new String[Integer.parseInt(N[0])];
		for (int i = 0; i < Integer.parseInt(N[0]); i++) {
			String s=br.readLine().trim();
			m.arr.put(s, i);
			m.ar[i]=s;
		}

		for (int i = 0; i < Integer.parseInt(N[1]); i++) {
			m.checking(br.readLine().trim());
		}
		System.out.println(m.sb);
	}
}
