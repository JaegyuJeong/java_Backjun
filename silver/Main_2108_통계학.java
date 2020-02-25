package backjun.silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_2108_통계학 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] check = new int[8001];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			check[arr[i]+4000]++;
		}
		Arrays.sort(arr);
		double sum = 0;
		for (int i = 0; i < N; i++) {
			sum += arr[i];
		}
		System.out.println((int) Math.round((double) (sum / N)));
		System.out.println(arr[N / 2]);

		int max_idx = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 8001; i++) {
			if (check[max_idx] < check[i]) {
				max_idx = i;
				list.clear();
			} else if (check[i] != 0 && check[i] == check[max_idx]) {
				list.add(i - 4000); // 두번째 최빈값부터 계속 리스트에 추가
			}
		}
		if (list.size() != 0)
			System.out.println(list.get(0));
		else
			System.out.println(max_idx - 4000);

		System.out.println(arr[N - 1] - arr[0]);
	}

}
