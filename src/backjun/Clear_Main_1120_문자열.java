package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Clear_Main_1120_문자열 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i<= s2.length()-s1.length(); i++) {
			int cnt=0;
			
			for (int j = 0 ; j<s1.length();j++) {
				if(s1.charAt(j)!= s2.charAt(j+i)) {
					cnt++;
				}
				
				
			}
			if(min>cnt) {
				min=cnt;
			}
			
		}
		System.out.println(min);
	}

}
