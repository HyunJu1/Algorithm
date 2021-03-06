package 백준2957_이진트리cnt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	int key;
	Main left;
	Main right;
	Main rootNode;
	int cnt = 0;
	StringBuilder sb = new StringBuilder();

	public Main insertKey(Main T, int x) {

		if (T == null) {
			Main newNode = new Main();
			newNode.key = x;
			return newNode;
		} else 
			if (x < T.key) {
			cnt++;
			T.left = insertKey(T.left, x);
			return T;

		} else if (x > T.key) {
			cnt++;
			T.right = insertKey(T.right, x);
			return T;
		} else {
			cnt++;
			return T;
		}
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main T = new Main();
		int N = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < N; i++) {
			T.rootNode = T.insertKey(T.rootNode, Integer.parseInt(br.readLine().trim()));
			T.sb.append(T.cnt + "\n");
		}
		System.out.println(T.sb);
	}

}
