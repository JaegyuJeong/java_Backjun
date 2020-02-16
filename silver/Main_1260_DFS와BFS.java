package backjun.silver;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_1260_DFS와BFS {
	static int N;
	static int M;
	static int V;
	static int[][] arr;
	static boolean[] visit;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		arr = new int[N][N];
		visit = new boolean[N];
		int node;
		int adj;

		for (int i = 0; i < M; i++) {
			node = sc.nextInt();
			adj = sc.nextInt();
			arr[node - 1][adj - 1] = 1;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		dfs(V - 1);
		System.out.println();
		Arrays.fill(visit, false);

		bfs(V - 1);
	}

	private static void dfs(int i) {
		visit[i] = true;
		System.out.print((i + 1) + " ");
		for (int j = 0; j < N; j++) {
			if (arr[i][j] != 0 && !visit[j]) {
				dfs(j);
			}
		}
	}

	private static void bfs(int i) {
		LinkedList<Integer> queue = new LinkedList<>();
		queue.offer(i);
		visit[i] = true;
		int cur;
		while (!queue.isEmpty()) {
			cur = queue.poll();
			System.out.print((cur + 1) + " ");
			for (int j = 0; j < N; j++) {
				if (arr[cur][j] != 0 && !visit[j]) {
					queue.offer(j);
					visit[j] = true;
				}
			}
		}
	}

}
