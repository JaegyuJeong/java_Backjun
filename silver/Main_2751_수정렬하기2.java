package backjun.silver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main_2751_수정렬하기2 {
	static int[] sorted;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		sorted = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		mergeSort(arr, 0, N - 1);

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) >> 1;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);

		}

	}

	private static void merge(int[] arr, int s, int mid, int n) {
		// TODO Auto-generated method stub
		int start = s, end = n, next = mid + 1, k = s;

		while (start <= mid && next <= end) {
			// 두 그룹의 데이터를 비교 후 두 그룹 중 작은 데이터 순으로 sorted배열에 임시로 정렬한다.
			if (arr[start] <= arr[next]) {
				sorted[k] = arr[start++];
			} else {
				sorted[k] = arr[next++];
			}
			k++;
		}

		// 임시로 정렬된 sorted 배열의 data 배열에 있는 남은 데이터를 옮겨 놓는다.
		if (start > mid) {
			for (int i = next; i <= n; i++, k++) {
				sorted[k] = arr[i];
			}
		} else {
			for (int i = start; i <= mid; i++, k++) {
				sorted[k] = arr[i];

			}
		}
		// sorted 배열의 데이터를 data배열로 옮기기
		for (int i = s; i <= n; i++) {
			arr[i] = sorted[i];
		}
	}

}
