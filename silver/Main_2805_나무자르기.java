package backjun.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2805_나무자르기 {
	static long max = 0;
	static int[] namu;
	static int N;
	static int M;
	static long minLen = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		namu = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			namu[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(namu);
		bw.write(Bsearch(0, namu[namu.length - 1]) + "\n");
		bw.flush();
		bw.close();

	}

	private static long Bsearch(long left, long right) {
		long sum = 0;
		long mid = (left + right) / 2;
		if (left > right)
			return max;
		for (int i : namu) {
			if (i < mid)
				continue;
			sum += i - mid;
		}
		if (sum >= M) {
			if (sum <= minLen) {
				minLen = sum;
				max = mid;
			}
			return Bsearch(mid + 1, right);
		} else {
			return Bsearch(left, mid - 1);
		}
	}

}
