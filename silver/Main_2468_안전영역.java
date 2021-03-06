package backjun.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2468_안전영역 {
	static int N;
	static int[][] section;
	static boolean[][] visit;
	static int cnt = 0;
	static int[][] pos = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		section = new int[100][100];
		visit = new boolean[100][100];
		int max = 0;
		int min = 100;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				section[i][j] = sc.nextInt(); // 높이는 100이하
				if (section[i][j] > max)
					max = section[i][j];
				if (section[i][j] < min)
					min = section[i][j];
			}
		}
		sc.close();

		int result = 1;
		for (int i = min; i < max; i++) {
			cnt = 0;

			for (int j = 0; j < 100; j++) {
				Arrays.fill(visit[j], false);
			}

			for (int y = 0; y < N; y++) {
				for (int x = 0; x < N; x++) {
					if (!visit[y][x] && section[y][x] > i) { // 물에 잠기지 않은 곳만 확인
						dfs(x, y, i);
						cnt++;
					}
				}
			}

			result = Math.max(result, cnt);
		}

		System.out.println(result);

	}

	private static void dfs(int x, int y, int height) {

		// 장외
		if (x < 0 || x >= N || y < 0 || y >= N) {
			return;
		}

		if (visit[y][x] || section[y][x] <= height) {
			return;
		}

		visit[y][x] = true;

		for (int i = 0; i < 4; i++) {
			int nextX = x + pos[i][0];
			int nextY = y + pos[i][1];

			dfs(nextX, nextY, height);
		}

	}
}