package com.js.pekah.algorithms.d0925;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ9095_123더하기 {
	static int N;
	static int dp[] = new int[11];
	static int result;
	
	public static int solve(int n) {
		if (n < 4) return dp[n];
		
		for (int i = 4; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for (int tc = 0; tc < T; tc++) {
			N = Integer.parseInt(br.readLine());
			
			System.out.println(solve(N));
		}
	}
}
