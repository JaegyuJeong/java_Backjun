package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Clear_Main_2991_사나운개 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
	
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ;i<3; i++) {
			int cnt = 0;
			int X = Integer.parseInt(st.nextToken());
			int dog1 = X%(A+B);
			if(dog1 <= A&&dog1>0) {
				cnt++;
			}
			
			int dog2 = X%(C+D);
			if(dog2 <=C&&dog2>0) {
				cnt++;
			}
			System.out.println(cnt);
		}
	}

}
