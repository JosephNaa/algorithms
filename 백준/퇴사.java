package com.js.pekah.algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퇴사 {
	static int N;
	static int T[];
	static int P[];
	static int result;
	
	public static void dfs(int idx, int money) {
		if (idx >= N) {
			result = Math.max(result, money);
			return;
		}

		if (idx + T[idx] > N) dfs(idx + T[idx], money);
		else dfs(idx + T[idx], money + P[idx]);
		
		dfs(idx+1, money);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		T = new int[N];
		P = new int[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0);
		
		System.out.println(result);
	}
}
