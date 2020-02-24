package backjun.silver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1920_수찾기 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int ch_N = Integer.parseInt(br.readLine());
		int[] checkNums = new int[ch_N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < ch_N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			for (int j = 0; j < N; j++) {
				if (tmp == arr[j]) {
					checkNums[i] = 1;
					break;
				}
			}
		}

		for (int i = 0; i < ch_N; i++) {
			System.out.println(checkNums[i]);
		}
	}

}
