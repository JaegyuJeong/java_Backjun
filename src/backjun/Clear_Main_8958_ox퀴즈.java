package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Clear_Main_8958_ox퀴즈 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i< input ; i++) {
			String s = br.readLine();
			int sum = 0;
			int cnt =0 ;
			char[] arr = new char[s.length()];
			for(int j = 0 ; j<s.length();j ++) {
				arr[j] = s.charAt(j);
				if(j == 0 && arr[j] == 'O') {
					sum = 1;
					cnt++;
				}else if(j!=0&&arr[j] == 'O') {
					sum+=++cnt;
				}else if(arr[j] == 'X') {
					cnt = 0;
				}
			}
			System.out.println(sum);
			
		}

	}

}
