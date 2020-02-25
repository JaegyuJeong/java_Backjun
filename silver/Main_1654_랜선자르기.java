package backjun.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1654_랜선자르기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);

		long max = arr[k - 1];
		long min = 1;
		long mid = 0;

		while (max >= min) {
			mid = (max + min) / 2;

			long cnt = 0;

			for (int j = 0; j < arr.length; j++) {
				cnt += arr[j] / mid;
			}

			if (cnt >= n) {
				min = mid + 1;
			} else if (cnt < n) {
				max = mid - 1;
			}
		}
		System.out.println(max);
	}

}
