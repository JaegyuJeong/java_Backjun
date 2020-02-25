package backjun.bronze;

import java.util.Scanner;

public class Main_2775_부녀회장이될테야 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(sum(k, n));
		}
	}

	private static int sum(int k, int n) {
		if (n == 0) {
			return 0;
		} else if (k == 0) {
			return n;
		} else {
			return sum(k, n - 1) + sum(k - 1, n);
		}
	}
}
