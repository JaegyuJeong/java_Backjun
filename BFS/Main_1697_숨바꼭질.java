package backjun.BFS;

import java.util.LinkedList;
import java.util.Scanner;

public class Main_1697_숨바꼭질 {
	static int N,K;
	static int[] visit = new int[100001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		
		BFS();
	}
	private static void BFS() {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		queue.add(N);
		visit[N] = 1;
		
		while(!queue.isEmpty()) {
			N = queue.poll();
			
			if(N==K)break;
			if(N+1 <= 100000 && visit[N+1] == 0 ) {
				queue.add(N+1);
				visit[N+1] = visit[N]+1;
			}
			if(N-1>=0 && visit[N-1] == 0) {
				queue.add(N-1);
				visit[N-1] = visit[N]+1;
			}
			if(N*2 <=100000 && visit[N*2] ==0) {
				queue.add(N*2);
				visit[N*2] = visit[N] + 1;
			}
		}
		System.out.println(visit[K]-1);
	}

}
