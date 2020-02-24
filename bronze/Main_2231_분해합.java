package backjun.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2231_분해합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int min_val = Integer.MAX_VALUE;
		boolean flag = true;
		for (int i = 1; i <= 1000000; i++) {
			if (calc(i) == N) {
				min_val = Math.min(min_val, i);
				flag = false;
			}
		}
		if (flag) {
			System.out.println(0);
		} else {
			System.out.println(min_val);
		}
	}

	private static int calc(int num) {
		int sum = num;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

}
