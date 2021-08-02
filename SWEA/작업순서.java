package com.ssafy.algorithm.d0730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 작업순서 {
	public static int[][] orders;
	public static boolean[] visited;
	public static int[] ans;
	public static int count;
	
	public static void Solve() {
		for (int i = 0; i < orders.length; i++)
			if (!visited[i]) DFS(i);
		
		for (int i : ans)
			System.out.print(i + " ");
	}
	
	public static void DFS(int v) {
		for (int i = 0; i < orders.length; i++) 
			if (!visited[i] && orders[i][v] == 1) return;
		
		visited[v] = true;
		ans[count++] = v+1;
		
		for (int i = 0; i < orders.length; i++)
			if (!visited[i] && orders[v][i] == 1) DFS(i);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int test_case = 1; test_case <= 10; test_case++) {
			st = new StringTokenizer(br.readLine(), " ");
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			orders = new int[V][V];
			visited = new boolean[V];
			ans = new int[V];
			count = 0;
			
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < E; i++) {
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				
				orders[start-1][end-1] = 1;
			}
			
			System.out.print("#" + test_case + " ");
			Solve();
			System.out.println();
		}
	}
}
