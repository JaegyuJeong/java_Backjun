package backjun.bronze;

import java.util.Scanner;

public class Main_1157_단어공부 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toUpperCase();
		char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char[] arr = new char[s.length()];
		int[] cnt_arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (arr[i] == alphabet[j]) {
					cnt_arr[j]++;
				}
			}
		}
		int max = Integer.MIN_VALUE;
		int max_idx = Integer.MIN_VALUE;

		for (int i = 0; i < cnt_arr.length; i++) {
			if (max < cnt_arr[i]) {
				max = cnt_arr[i];
				max_idx = i;
			}
		}
		int cnt = 0;
		for (int i = 0; i < cnt_arr.length; i++) {
			if (max == cnt_arr[i]) {
				cnt++;
			}
		}
		if(cnt>=2) {
			System.out.println("?");
		}else {
			System.out.println(alphabet[max_idx]);
		}

	}

}
