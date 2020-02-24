package backjun.silver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1978_소수찾기 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			boolean flag = false;
			if (tmp == 1)
				continue;
			for (int j = 2; j < tmp; j++) {
				if (tmp % j == 0) {
					flag = true;
				}
			}
			if (!flag) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
