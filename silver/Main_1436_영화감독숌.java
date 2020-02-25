package backjun.silver;

import java.util.Scanner;

public class Main_1436_영화감독숌 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int num = 0;

		while (N > 0) {
			num++;
			String str = Integer.toString(num);

			if (str.contains("666"))
				N--;
		}
		System.out.println(num);
	}

}
