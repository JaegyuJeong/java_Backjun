package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Clear_Main_2567_색종이_2 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int paper_num = Integer.parseInt(br.readLine());
		int[][] large_paper = new int[100 + 1][100 + 1]; // 큰 도화
		int[][] pos = {{0,-1},{-1,0},{0,1},{1,0}};
		StringTokenizer st;
		int x; // 왼쪽벽과 왼쪽면의 거리
		int y; // 아래벽과 아랫면의 거리
		int cnt = 0; 
		for (int i = 0; i < paper_num; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			for (int z = 100- y; z > 100 - y -10; z--) {
				for (int j = x; j < x + 10; j++) {
					large_paper[z][j] = 1;
				}
			}
		}

		for (int i = 0; i < large_paper.length; i++) {
			for (int j = 0; j < large_paper[0].length; j++) {
				if(large_paper[i][j] == 1) {
					for(int z = 0 ; z<4;z++) {
						if(large_paper[i+pos[z][0]][j+pos[z][1]] == 0) {
							cnt++;
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
