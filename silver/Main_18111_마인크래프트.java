package backjun.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_18111_마인크래프트 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 세로
		int M = Integer.parseInt(st.nextToken()); // 가로
		int B = Integer.parseInt(st.nextToken()); // 블록 수 (인벤토리 안)
		int max_height = Integer.MIN_VALUE;
		int min_height = Integer.MAX_VALUE;
		int result = Integer.MAX_VALUE;
		int block_height = 0;

		int[][] arr = new int[N][M];

		// 데이터 입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max_height = Math.max(max_height, arr[i][j]);
				min_height = Math.min(min_height, arr[i][j]);
			}
		}

		for (int i = min_height; i <= max_height; i++) {
			int time = 0;
			int block = B;

			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					int height = arr[j][k] - i;
					if (height > 0) {
						time += height * 2;
						block += height;
					} else if (height < 0) {
						time -= height;
						block += height;
					}
				}
			}
			if (block >= 0) {
				if (time <= result) {
					result = time;
					block_height = i;
				}
			}
		}
		bw.write(result + " " + block_height);
		bw.flush();
		bw.close();
	}

}
