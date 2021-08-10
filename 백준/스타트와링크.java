package com.js.pekah.algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스타트와링크 {
	static int N;
	static int arr[][];
	static boolean visited[];
	static int result = Integer.MAX_VALUE;
	
	public static void team(int cur, int count) {
		if (count == N/2) {
			result = Math.min(result, getAbility());
			return;
		}
		
		for (int i = cur; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				team(i, count + 1);
				visited[i] = false;
			}
		}
	}
	
	public static int getAbility() {
		int teamA = 0;
		int teamB = 0;
		
		for (int i = 0; i < N - 1; i++) {
			for (int j = i+1; j < N; j++) {
				if (visited[i] && visited[j]) teamA += arr[i][j] + arr[j][i];
				else if (!visited[i] && !visited[j]) teamB += arr[i][j] + arr[j][i];
			}
		}
		
		return Math.abs(teamA - teamB);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visited = new boolean[N];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		team(0, 0);
		
		System.out.println(result);
	}
}
