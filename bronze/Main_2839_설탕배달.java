package backjun.bronze;

import java.util.Scanner;

public class Main_2839_설탕배달 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int cnt = 0;
		while (N != 0) {
			if (N % 3 != 0 && N % 5 != 0 && N < 5) {
				cnt = -1;
				break;
			}
			if (N % 5 == 0) {
				cnt++;
				N -= 5;
			} else if (N % 3 == 0) {
				cnt++;
				N -= 3;
			} else {
				cnt++;
				N -= 5;
			}
		}
		System.out.println(cnt);
	}

}
