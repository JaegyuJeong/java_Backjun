package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3109_빵집_정재규 {
	static int R;
	static int C;
	static int ans;
	static char[][] map;
	static boolean[][] visit;
	static int[][] pos = { { -1, 1 }, { 0, 1 }, { 1, 1 } };
	static int a;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		visit = new boolean[R][C];
		for (int i = 0; i < R; i++) {
			String s = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = s.charAt(j);
			}
		}

		for (int i = 0; i < R; i++) { // 행으로 출발점 탐색
			a=0;
			dfs(i, 0);
		}
		System.out.println(ans);

	}

	private static void dfs(int r, int c) {
		
		if (c == C-1) {
			a = 1;
			ans++;
			return; // 도착 지점까지 왔기 때문에 경로 탐사는 중지
		}
		int nr = 0;
		int nc = 0;
		visit[r][c] = true;
		for (int i = 0; i < 3; i++) {
			nr = r + pos[i][0];
			nc = c + pos[i][1];
			if (nr > -1 && nr < R && nc > -1 && nc < C && map[nr][nc] == '.' && !visit[nr][nc] && a != 1) {
				dfs(nr, nc);
			}
		}

	}

}
