package backjun;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Clear_Main_11399_Atm {

	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr= new int[N];
		int sum = 0;
		int answer = 0;
		for(int i = 0 ; i< N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for(int i = 0 ; i< arr.length; i++) {
			sum+=arr[i];
			answer +=sum;
		}
		System.out.println(answer);
	}

}
