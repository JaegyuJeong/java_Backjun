package backjun.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main_5430_AC {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= N; tc++) {
			String[] p = br.readLine().split("");
			int n = Integer.parseInt(br.readLine());
			String[] x = br.readLine().replace("[", "").replace("]", "").split(",");
			String result = ac(p, n, x);
			System.out.println(result);

		}
	}

	private static String ac(String[] p, int n, String[] x) {
		Deque<Integer> dQ = makeDq(n, x);
		String dir = "LEFT";

		for (String order : p) {
			if ("R".equals(order)) {
				if (dir.equals("LEFT")) {
					dir = "RIGHT";
				} else {
					dir = "LEFT";
				}
			} else if ("D".equals(order)) {
				if (dQ.isEmpty()) {
					return "error";
				} else {
					if (dir.equals("LEFT")) {
						dQ.pollFirst();
					} else {
						dQ.pollLast();
					}
				}
			}
		}
		StringBuilder sb = showPrint(dQ, dir);
		return sb.toString();
	}

	private static StringBuilder showPrint(Deque<Integer> dQ, String dir) {
		int dqLen = dQ.size();
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < dqLen; i++) {
			if (dir.equals("LEFT")) {
				sb.append(dQ.pollFirst());
			} else {
				sb.append(dQ.pollLast());
			}
			if (!dQ.isEmpty())
				sb.append(",");
		}
		sb.append("]");
		return sb;
	}

	private static Deque<Integer> makeDq(int n, String[] x) {
		Deque<Integer> dQ = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			dQ.add(Integer.parseInt(x[i]));
		}
		return dQ;
	}

}
