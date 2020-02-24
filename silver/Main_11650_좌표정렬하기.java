package backjun.silver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class XY {
	int x;
	int y;
}

public class Main_11650_좌표정렬하기 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		XY[] xy = new XY[N];
		for (int i = 0; i < N; i++) {
			xy[i] = new XY();
			StringTokenizer st = new StringTokenizer(br.readLine());
			xy[i].x = Integer.parseInt(st.nextToken());
			xy[i].y = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(xy, new Comparator<XY>() {

			@Override
			public int compare(XY o1, XY o2) {
				if (o1.x == o2.x) {
					return o1.y - o2.y;
				}
				return o1.x - o2.x;
			}

		});

		for (int i = 0; i < N; i++) {
			System.out.println(xy[i].x + " " + xy[i].y);
		}
	}

}
