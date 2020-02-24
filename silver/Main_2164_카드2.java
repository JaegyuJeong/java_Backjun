package backjun.silver;

import java.util.LinkedList;
import java.util.Scanner;

public class Main_2164_카드2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i <=N; i++) {
			queue.add(i);
		}
		int ans = 0;
		int tmp;
		while (!queue.isEmpty()) {
			ans = queue.peek();
			
			queue.poll();
			if(!queue.isEmpty()) {				
				tmp = queue.pollFirst();
				queue.add(tmp);
				ans = queue.peek();
			}
		}
		System.out.println(ans);
	}

}
