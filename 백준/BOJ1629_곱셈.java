package com.js.pekah.algorithms.d1017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1629_곱셈 {
	static long A, B, C;
	
	public static long solve(long a, long b, long c) {
		if (b == 0) return 1;
		
		long n = solve(a, b / 2, c);
		
		if (b % 2 == 0) return (n * n % c);
		else return (n * n % c) * a % c;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		System.out.println(solve(A, B, C));
	}
}
