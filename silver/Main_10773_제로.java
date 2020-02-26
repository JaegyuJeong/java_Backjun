package backjun.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773_제로 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				stack.pop();
			} else {
				stack.push(x);
			}
		}

		int sum = 0;
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}

}
