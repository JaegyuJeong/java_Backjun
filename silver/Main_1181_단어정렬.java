package backjun.silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_1181_단어정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] dataSet = new String[N];

		for (int i = 0; i < N; i++) {
			dataSet[i] = sc.next();

		}
		Arrays.sort(dataSet);
		Arrays.sort(dataSet, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		System.out.println(dataSet[0]);
		for (int i = 1; i < dataSet.length; i++) {
			if (dataSet[i - 1].equals(dataSet[i])) {
				continue;
			}
			System.out.println(dataSet[i]);
		}

	}

}
