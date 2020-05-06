package backjun.silver;

import java.util.Scanner;

public class Main_6987_월드컵 {
	static int[] gameA;
	static int[] gameB;
	static int[][] resultMap;
	static String ans = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 4개 case
		for (int tc = 1; tc <= 4; tc++) {
			resultMap = new int[6][3];
			gameA = new int[15];
			gameB = new int[15];
			// 게임 만들기
			int cnt = 0;
			for (int i = 0; i < 5; i++) {
				for (int j = i + 1; j < 6; j++) {
					gameA[cnt] = i;
					gameB[cnt] = j;
					cnt++;
				}
			}

			// 입력 결과값 받기
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 3; j++) {
					resultMap[i][j] = sc.nextInt();
				}
			}
			
			ans += dfs(0);
			ans += " ";
		}
		System.out.println(ans.trim());
	}

	private static String dfs(int n) {
		if(n>= 15) {
			for(int i = 0 ; i<6; i++) {
				if(resultMap[i][0] != 0) return "0";
				if(resultMap[i][1] != 0) return "0";
				if(resultMap[i][2] != 0) return "0";
			}
			return "1";
		}
		
		int a = gameA[n];
		int b = gameB[n];
		
		// a가 이기고 b가 지는 경우
		if(resultMap[a][0] !=0 && resultMap[b][2] != 0) {
			resultMap[a][0]--; 
			resultMap[b][2]--;
			if((dfs(n+1).equals("1"))) return "1";
			resultMap[a][0]++; 
			resultMap[b][2]++;
		}
		
		// 비기는 경우
		if(resultMap[a][1] !=0 && resultMap[b][1] != 0) {
			resultMap[a][1]--; 
			resultMap[b][1]--;
			if((dfs(n+1).equals("1"))) return "1";
			resultMap[a][1]++; 
			resultMap[b][1]++;
		}
		// b가 이기고 a가 지는 경우
		if(resultMap[a][2] !=0 && resultMap[b][0] != 0) {
			resultMap[a][2]--; 
			resultMap[b][0]--;
			if((dfs(n+1).equals("1"))) return "1";
			resultMap[a][2]++; 
			resultMap[b][0]++;
		}
		
		return "0";
	}

}
