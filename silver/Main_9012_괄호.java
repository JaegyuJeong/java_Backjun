package backjun.silver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_9012_괄호 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			boolean ans = true;
			String s = br.readLine();
			Stack<Character> stack = new Stack<>();
			for (int j = 0; j < s.length(); j++) {
				char temp = s.charAt(j);
				if (temp == '(') {
					stack.push(temp);
				} else if (temp == ')') {
					if (!stack.isEmpty()) {
						stack.pop();
					} else {
						ans = false;
					}
				}
			}
			if (!stack.isEmpty())
				ans = false;

			if (ans) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
