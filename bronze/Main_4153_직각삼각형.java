package backjun.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Main_4153_직각삼각형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		go: while (true) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] == 0)
					break go;
			}
			Arrays.sort(arr);
			if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}

	}

}
