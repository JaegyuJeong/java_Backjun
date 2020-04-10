package backjun.gold;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_1197_최소스패닝트리 {
   static int[]parents;
   static int[]rank;
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int V = sc.nextInt();//정점입력
	 int E = sc.nextInt();//간선입력
	 parents = new int[V];
	 rank = new int[V];
	 int[][]edges = new int[E][3];//간선배열
	 for (int i = 0; i < E; i++) {
		edges[i][0]=sc.nextInt()-1;
		edges[i][1]=sc.nextInt()-1;
		edges[i][2]=sc.nextInt();//가중치
	 }
	 
	 Arrays.sort(edges, new Comparator<int[]>() {
		 @Override
		public int compare(int[] o1, int[] o2) {
			return Integer.compare(o1[2], o2[2]);
		}
	 });
	 
	 for(int i=0; i<V; i++) {
		 makeSet(i);
	 }
	 int result=0;
	 int cnt=0;
	 for(int i=0; i<E; i++) {
		 int a = findSet(edges[i][0]);
		 int b = findSet(edges[i][1]);
		 if(a==b)
			 continue;
		 union(a,b);
		 result += edges[i][2];
		 cnt++;
		 if(cnt == V-1)
			  break;
	 }
	 System.out.println(result);
   }
   // make : 자기자신을 루트노드 만들기
   static void makeSet(int x) {
	   parents[x]=x;
   }
   // find : 루트노드 찾기 자기자신이 루트노드면 반환 아니면 찾으러간다.	
   static int findSet(int x) {
	   if(x==parents[x]) {
		   return x;
	   }else {
		   parents[x]=findSet(parents[x]);
		   return parents[x];
	   }
   }
   //가중치를 고려하여 루트노드 변경해주기
   static void union(int x,int y) {
	   int px = findSet(x);
	   int py = findSet(y);
	   if(rank[px]>rank[py]) {
		   parents[py]=px;
	   }else {
		   parents[px]=py;
		   if(rank[px]==rank[py]) {
			   rank[py]++;
		   }
	   }
   }
}
