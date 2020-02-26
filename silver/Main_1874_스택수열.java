package backjun.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

public class Main_1874_스택수열 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] check = new int[N];
		Stack<Integer> stack = new Stack<>();
		ArrayList<Character> queue = new ArrayList<Character>();
		for (int i = 0; i < N; i++) {
			check[i] = Integer.parseInt(br.readLine());
		}
		int idx = 0;
		for (int i = 1; i <= N; i++) {
			stack.add(i);
			queue.add('+');
			while (!stack.isEmpty() && check[idx] == stack.peek()) {
				idx++;
				stack.pop();
				queue.add('-');
			}
		}
		if (!stack.isEmpty()) {
			System.out.println("NO");
		} else {
			for (int i = 0; i < queue.size(); i++) {
				bw.write(queue.get(i) + "\n");
			}
			bw.flush();
		}
	}
}
