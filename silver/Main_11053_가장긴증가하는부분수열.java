package backjun.silver;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11053_가장긴증가하는부분수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] LIS = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < LIS.length; i++) {
			LIS[i] = 1;
			for (int j = 0; j < i; j++) {
				if (A[j] < A[i] && LIS[i] < LIS[j] + 1) {
					LIS[i] = LIS[j] +1;
				}
			}
		}
		System.out.println(Arrays.toString(LIS));
		// LIS 구하기
		int maxLISIndex = 0;
		for (int i = 0; i < LIS.length; i++) {
			if (LIS[maxLISIndex] < LIS[i]) {
				maxLISIndex = i;
			}
		}
		System.out.println(LIS[maxLISIndex]);
	}

}
