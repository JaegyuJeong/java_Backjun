package backjun.bronze;

import java.util.Scanner;

public class Main_2675_문자열반복 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int re = sc.nextInt();
			String s = sc.next();
			char[] ch = s.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				for (int j = 0; j < re; j++) {
					System.out.print(ch[i]);
				}
			}
			System.out.println();
		}

	}

}
