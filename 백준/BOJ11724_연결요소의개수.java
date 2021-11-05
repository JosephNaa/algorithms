package com.js.pekah.algorithms.d1105;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11724_연결요소의개수 {
	static int N, M;
	static boolean arr[][];
	static boolean visited[];
	static int result;
	
	public static void dfs(int start) {
		visited[start] = true;
		
		for (int i = 1; i <= N; i++) {
			if (arr[start][i] && !visited[i]) dfs(i);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		result = 0;
		
		arr = new boolean[1001][1001];
		visited = new boolean[1001];
		
		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			arr[num1][num2] = true;
			arr[num2][num1] = true;
		}
		
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				dfs(i);
				result++;
			}
		}
		
		System.out.println(result);
		
	}
}
