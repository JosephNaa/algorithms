package com.js.pekah.algorithms.d1116;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ6603_로또 {
	static int N;
	static int arr[];
	static boolean result[];
	
	static void solution(int start, int depth) {
		if (depth == 6) {
			for (int i = 0; i < N; i++) {
				if (result[i]) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
		
		for (int i = start; i < N; i++) {
			result[i] = true;
			solution(i + 1, depth + 1);
			result[i] = false;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			
			if (N == 0) break;
			
			arr = new int[N];
			result = new boolean[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			solution(0, 0);
			System.out.println();
		}
	}
}
