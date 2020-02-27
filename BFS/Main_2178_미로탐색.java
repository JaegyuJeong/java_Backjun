package backjun.BFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_2178_미로탐색 {
	static int N;
	static int M;
	static int[][] arr;
	static boolean[][] visit;
	static int[][] pos = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N + 1][M + 1];
		visit = new boolean[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			String s = br.readLine();
			for (int j = 1; j <= M; j++) {
				arr[i][j] = s.charAt(j - 1) - '0';
			}
		}
		bfs(1, 1);

		bw.write(arr[N][M]+"\n");
		bw.flush();
		bw.close();
	}

	private static void bfs(int row, int col) {
		LinkedList<int[]> queue = new LinkedList<>();
		queue.add(new int[] { row, col });
		int[] cur;
		while (!queue.isEmpty()) {
			cur = queue.poll();
			visit[row][col] = true;

			int nr, nc;
			for (int i = 0; i < 4; i++) {
				nr = cur[0] + pos[i][0];
				nc = cur[1] + pos[i][1];
				if (nr > 0 && nr <= N && nc > 0 && nc <= M && !visit[nr][nc] && arr[nr][nc] != 0) {
					queue.add(new int[] { nr, nc });
					visit[nr][nc] = true;
					arr[nr][nc] = arr[cur[0]][cur[1]] + 1;
				}

			}
		}

	}

}
