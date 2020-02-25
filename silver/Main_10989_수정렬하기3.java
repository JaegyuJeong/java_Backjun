package backjun.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10989_수정렬하기3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[10000 + 1];
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num] += 1;
		}

		for (int i = 0; i < 10000 + 1; i++) {
			if (arr[i] != 0) {
				for (int j = 0; j < arr[i]; j++) {
					bw.write(String.valueOf(i));
					bw.newLine();
				}
			}
		}
		bw.flush();
		bw.close();
	}

}
