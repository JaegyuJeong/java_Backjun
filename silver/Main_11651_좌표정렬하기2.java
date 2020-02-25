package backjun.silver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class XY {
	int x;
	int y;
}

public class Main_11651_좌표정렬하기2 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		XY[] xy = new XY[N];
		for (int i = 0; i < N; i++) {
			xy[i] = new XY();
			xy[i].x = sc.nextInt();
			xy[i].y = sc.nextInt();
		}

		Arrays.sort(xy, new Comparator<XY>() {

			@Override
			public int compare(XY o1, XY o2) {
				if (o1.y == o2.y) {
					return o1.x - o2.x;
				} else {
					return o1.y - o2.y;
				}
			}

		});

		for (int i = 0; i < N; i++) {
			System.out.println(xy[i].x + " " + xy[i].y);
		}
	}

}
