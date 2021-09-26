package com.js.pekah.algorithms.d0926;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2579_계단오르기 {
	static int N;
	static int arr[];
	static int dp[] = new int[301];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N + 1];
		
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = arr[1];
		
		if (N > 1) dp[2] = arr[1] + arr[2];
		
		for (int i = 3; i <= N; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-1]) + arr[i];
		}
		
		System.out.println(dp[N]);
	}
}
