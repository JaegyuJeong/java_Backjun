package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_7576_토마토_정재규 {
	static int[][] pos = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
	static int N, M;
	static int[][] box;
	static boolean[][] visited;
	static int cnt;
	static LinkedList<int[]> queue = new LinkedList<>();

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		box = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine().trim());
			for (int j = 0; j < M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 1) {
					cnt = 1;
					queue.offer(new int[] { i, j, cnt });
				}
			}
		}
		bfs();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 0) {
					cnt = 0;
				}
			}
		}
		System.out.println(cnt - 1);
	}

	private static void bfs() {

		int[] cur;
		int r, c, d, nr, nc;
		while (!queue.isEmpty()) {
			cur = queue.poll();			
			r = cur[0];
			c = cur[1];
			d = cur[2] + 1;
			cnt = d - 1;
			visited[r][c] = true;
			for (int i = 0; i < 4; i++) {
				nr = r + pos[i][0];
				nc = c + pos[i][1];
				if (nr > -1 && nr < N && nc > -1 && nc < M && box[nr][nc] == 0 && box[nr][nc] != -1
						&& !visited[nr][nc]) {
					visited[nr][nc] = true;
					box[nr][nc] = d;
					queue.offer(new int[] { nr, nc, d });
				}
			}
		}
	}

}
