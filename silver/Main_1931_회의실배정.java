package backjun.silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Time {
	int x;
	int y;
}

public class Main_1931_회의실배정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Time[] times = new Time[N];
		for (int i = 0; i < N; i++) {
			times[i] = new Time();
			times[i].x = sc.nextInt();
			times[i].y = sc.nextInt();
		}
		Arrays.sort(times, new Comparator<Time>() {

			@Override
			public int compare(Time o1, Time o2) {
				if (o1.y == o2.y) {
					return o1.x - o2.x;
				} else {
					return o1.y - o2.y;
				}
			}
		});

		int end = -1;
		int count = 0;

		for (int i = 0; i < N; i++) {
			if (times[i].x >= end) {
				end = times[i].y;
				count++;
			}
		}
		System.out.println(count);
	}

}
