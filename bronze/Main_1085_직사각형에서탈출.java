package backjun.bronze;

import java.util.Scanner;

public class Main_1085_직사각형에서탈출 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int min_dis = 10000000;

		if (min_dis > x) {
			min_dis = x;
		}
		if (min_dis > y) {
			min_dis = y;
		}
		if (min_dis > w-x) {
			min_dis = w-x;
		}
		if (min_dis > h-y) {
			min_dis = h-y;
		}
		System.out.println(min_dis);
	}

}
