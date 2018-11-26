package seventh;

import java.util.Scanner;

public class stack_10828 {
	int size;
	int top = 0;
	int[] stack = new int[100000];

	public void push(int j) {
		stack[++top] = j;
	}

	public void pop() {

		if (top <= 0) {
			System.out.println(-1);
			return;
		} else {
			System.out.println(stack[top--]);

		}
	}

	public void size() {
		System.out.println(top);
	}

	public void top() {
		System.out.println(stack[top]);
	}

	public void empty() {
		if (top == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		stack_10828 stack = new stack_10828();

		for (int i = 0; i < num; i++) {
			String ss = sc.next();
			if (ss.equals("push")) {
				int j = sc.nextInt();
				stack.push(j);
			} else if (ss.equals("pop")) {
				stack.pop();
			} else if (ss.equals("size")) {
				stack.size();
			} else if (ss.equals("top")) {
				stack.top();
			} else if (ss.equals("empty")) {
				stack.empty();
			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}
	}
}
