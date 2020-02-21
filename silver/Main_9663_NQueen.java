package backjun.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_9663_NQueen {
	static int N;
	static int[] arr;
	static int ans;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		ans = 0;

		dfs(0);
		System.out.println(ans);

	}

	private static void dfs(int cur_row) {
		if (cur_row == N) {
			ans++;
			return;
		}
		for (int col = 0; col < N; col++) {
			boolean flag = true;
			for (int row = 0; row < cur_row; row++) {
				if (arr[row] == col || cur_row - row == Math.abs(arr[row] - col)) {
					flag = false;
				}
			}
			if (flag) {
				arr[cur_row] = col;
				dfs(cur_row + 1);
			}
		}
	}

}
