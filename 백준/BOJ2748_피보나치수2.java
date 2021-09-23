package com.js.pekah.algorithms.d0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2748_피보나치수2 {
	static long N;
	static long dp[] = new long[91];
	
	public static long fibonacci(int n) {
		if (n == 0) return dp[0];
		else if (n == 1) return dp[1];
		else if (dp[n] != 0) return dp[n];
		else {
			dp[n] = fibonacci(n-1) + fibonacci(n-2);
			return dp[n];
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Long.parseLong(br.readLine());
		
		dp[0] = 0;
		dp[1] = 1;
		
		System.out.println(fibonacci((int) N));
	}
}
