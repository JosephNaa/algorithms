package com.js.pekah.algorithms.d0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1003_피보나치함수 {
	static int N;
	static int zero;
	static int one;
	static int arr[] = new int[41];
	static int sum[][] = new int[41][2];
	
	public static int fibonacci(int n) {
		if (n == 0) {
			return arr[0];
		} else if (n == 1) {
			return arr[1];
		} else if (arr[n] != 0) {
			return arr[n];
		} else {
			arr[n] = fibonacci(n-1) + fibonacci(n-2);
			sum[n][0] = sum[n-1][0] + sum[n-2][0];
			sum[n][1] = sum[n-1][1] + sum[n-2][1];
			return arr[n];
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		arr[0] = 0;
		arr[1] = 1;
		
		sum[0][0] = 1;
		sum[1][1] = 1;
		
		for (int i = 0; i < T; i++) {
			zero = 0;
			one = 0;
			N = Integer.parseInt(br.readLine());
			fibonacci(N);
			
			sb.append(sum[N][0]).append(" ").append(sum[N][1]).append("\n");
		}
		
		System.out.println(sb);
	}
}
