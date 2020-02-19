package backjun.bronze;

import java.util.Scanner;

public class Main_1546_평균 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] scores = new double[N];
		double M = Double.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			scores[i] = sc.nextInt();
			if (M < scores[i]) {
				M = scores[i];
			}
		}
		double sum = 0;
		for (int i = 0; i < N; i++) {
			scores[i] = scores[i] / M * 100;
			sum += scores[i];
		}
		double avg = sum / N;
		System.out.println(String.format("%.2f", avg));
	}

}
