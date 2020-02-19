package backjun.bronze;

import java.util.Scanner;

public class Main_2920_음계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int[] asc = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] des = { 8, 7, 6, 5, 4, 3, 2, 1 };

		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != asc[i]) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("ascending");
		} else {
			flag = true;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != des[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("descending");
			} else {
				System.out.println("mixed");
			}
		}

	}

}
