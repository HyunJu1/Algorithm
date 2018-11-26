package 백준5639_이진검색트리;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	int key;
	Main left;
	Main right;
	Main rootNode;

	StringBuilder sb = new StringBuilder();

	public void postOrder(Main root) {

		if (root != null) {

			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.key);
		}

	}

	public Main insertKey(Main T, int x) {

		if (T == null) {
			Main newNode = new Main();
			newNode.key = x;
			return newNode;
		} else if (x < T.key) {

			T.left = insertKey(T.left, x);
			return T;

		} else if (x > T.key) {

			T.right = insertKey(T.right, x);
			return T;
		} else {

			return T;
		}
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
	    Main main = new Main();
		Scanner sc = new Scanner(System.in);
		String line;
		while (sc.hasNext()) {

			try {
				main.rootNode = main.insertKey(main.rootNode, sc.nextInt());
			} catch (Exception e) {
				System.out.println("입력 종료");
				break;
			}
		}
		main.postOrder(main.rootNode);

	}
}
