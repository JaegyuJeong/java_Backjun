package backjun.bronze;

import java.util.Scanner;

public class Main_2292_벌집 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int res = 1;
		int cnt = 1;
		int sum = 6;

		while (true) {
			if (N <= cnt) {
				break;
			}
			cnt += sum;
			sum += 6;
			res++;
		}
		System.out.println(res);
	}

}
