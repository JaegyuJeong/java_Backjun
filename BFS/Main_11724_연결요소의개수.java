package backjun.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Main_11724_연결요소의개수 {
    public static ArrayList<ArrayList<Integer>> array;
    public static boolean check[];
    public static Queue<Integer> q;
    public static int linkcount;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        check = new boolean[n + 1];
        linkcount = 0;

        array = new ArrayList<ArrayList<Integer>>();
        // 입력받은 정점 + 1개로 인덱스 1부터 시작.
        for (int i = 0; i < n + 1; i++) {
            array.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            stk = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(stk.nextToken());
            int v = Integer.parseInt(stk.nextToken());

            array.get(u).add(v);
            array.get(v).add(u);
        }

        for (int i = 1; i <= n; i++) {
            if (check[i] == false) {
                //dfs(i);
                bfs(i);
                linkcount += 1;
            }
        }
        // printGraphToAdjList();
        System.out.println(linkcount);
    }

    // 그래프 출력 (인접리스트)
    public static void printGraphToAdjList() {
        for (int i = 1; i < array.size(); i++) {
            System.out.print("정점 " + i + "의 인접리스트");

            for (int j = 0; j < array.get(i).size(); j++) {
                System.out.print(" -> " + array.get(i).get(j));
            }
            System.out.println();
        }
    }

//    public static void dfs(int n) {
//        check[n] = true;
//        for (int i = 0; i < array.get(n).size(); i++) {
//            int next = array.get(n).get(i);
//            if (check[next] == false) {
//                dfs(next);
//            }
//        }
//    }

    public static void bfs(int n){
        q = new LinkedList<Integer>();
        check[n] = true;
        q.offer(n);
        while (!q.isEmpty()){
            int x = q.poll();
            for (int i = 0; i < array.get(x).size(); i++){
                int y = array.get(x).get(i);
                if (check[y] == false){
                    check[y] = true;
                    q.offer(y);
                }
            }
        }
    }
}