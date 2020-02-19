package backjun.bronze;

import java.util.Scanner;

public class Main_2908_상수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (cal(a) < cal(b)) {
			System.out.println(cal(b));
		} else {
			System.out.println(cal(a));
		}
	}

	private static int cal(int a) {

		int tmp1 = a % 10;
		a = a / 10;
		int tmp2 = a % 10;
		a = a / 10;
		int tmp3 = a;

		return tmp1 * 100 + tmp2 * 10 + tmp3;

	}

}
