package backjun.bronze;

import java.util.Scanner;

public class Main_10872_팩토리얼 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fac = 1;
		int N = sc.nextInt();

		for (int i = N; i >= 1; i--) {
			fac *= i;
		}
		System.out.println(fac);
	}

}
