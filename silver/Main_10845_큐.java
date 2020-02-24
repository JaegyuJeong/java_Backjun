package backjun.silver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_10845_큐 {

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> queue = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			int num = 0;
			if (order.equals("push")) {
				num = Integer.parseInt(st.nextToken());
			}

			switch (order) {
			case "push":
				queue.push(num);
				break;
			case "front":
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.peekLast());
				}
				break;
			case "back":
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.peekFirst());
				}
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if (queue.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "pop":
				if (queue.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(queue.pollLast());
				}
			}
		}

	}

}
