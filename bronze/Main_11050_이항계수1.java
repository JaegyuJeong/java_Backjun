package backjun.bronze;

import java.util.Scanner;

public class Main_11050_이항계수1 {
	static int N;
	static int K;
	static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		K = sc.nextInt();
		count = 0;

		combination(0, 0);
		System.out.println(count);

	}

	private static void combination(int start, int cnt) {
		if (cnt == K) {
			count++;
			return;
		}
		for (int i = start; i < N; i++) {
			combination(i + 1, cnt + 1);

		}

	}

}
