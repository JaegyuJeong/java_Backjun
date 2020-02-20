package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_2667_단지번호붙이기_DFS {
	static int no = 1;
	static int N;
	static int[][] map;
	static int[][] visit;
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine().trim());
		map = new int[N][N];
		visit = new int[N][N];

		// 데이터 읽기
		for (int i = 0; i < N; i++) {
			String st = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = st.charAt(j) - '0';
			}

		}

		// 배열을 전체 순회하면서 아파트(1)를 찾으면 bfs
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1 && visit[i][j] == 0) { // 아파트이고 && 방문하지 않은 아파트!
					dfs(i, j); // 새로운 단지
					no++;
				}
			}

		}
		// visit배열 순회하면 단지마다 아파트 수 count
		int[] count = new int[no];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (visit[i][j] > 0) {
					count[visit[i][j]]++;
				}
			}
		}
		// count 배열 정렬해서
		Arrays.sort(count);
		// 출력
		System.out.println(--no);
		for (int i = 1; i <= no; i++) {
			System.out.println(count[i]);
		}
	}

	/**
	 * BFS 탐색
	 * 
	 * @param row node -> row
	 * @param col node -> col
	 */
	private static void dfs(int row, int col) {
		Stack<int[]> stack = new Stack<>();
		
		stack.push(new int[] { row, col });
		int[] cur;
		int nr, nc;
		while (!stack.isEmpty()) {
			cur = stack.pop();
			row = cur[0];
			col = cur[1];
			if (map[row][col] == 1) {
				visit[row][col] = no;
				for (int i = 0; i < 4; i++) { // 현재 아파트에 인접된 아파트가 있는지 확인
					nr = row + dir[i][0];
					nc = col + dir[i][1];
					if (nr > -1 && nr < N && nc > -1 && nc < N && map[nr][nc] > 0 && visit[nr][nc] == 0) { // 경계검사
						stack.push(new int[] { nr, nc });

					}
				}
			}

		}

	}

}
