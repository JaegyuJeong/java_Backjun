package backjun.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Prior {
	int idx;
	int pri;

	public Prior(int idx, int pri) {
		this.idx = idx;
		this.pri = pri;
	}

}

public class Main_1966_프린터큐 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			LinkedList<Prior> queue = new LinkedList<>();

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				queue.add(new Prior(i, Integer.parseInt(st.nextToken())));
			}
			int res = 1;
			while (!queue.isEmpty()) {
				Prior cur_pri = queue.poll();
				boolean check = true;
				Iterator<Prior> it = queue.iterator();
				while (it.hasNext()) {
					Prior value = (Prior) it.next();
					if (cur_pri.pri < value.pri) {
						check = false;
						break;
					}
				}
				if (check == false) {
					queue.add(cur_pri);
				} else {
					if (cur_pri.idx == M) {
						bw.write(res + "\n");
						bw.flush();
					} else {
						res++;
					}
				}
			}
		}
	}
}
