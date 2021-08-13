package com.js.pekah.algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자끼워넣기 {
	static int op[];
	static boolean visited[];
	static int seq[];
	static int N;
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;
	
	public static void dfs(int cur, int idx) {
		if (idx == N) {
			MAX = Math.max(MAX, cur);
			MIN = Math.min(MIN, cur);
			return;
		}
		
		int temp = 0;
		for (int i = 0; i < op.length; i++) {
			if (op[i] > 0) {
				op[i]--;
				
				if (i == 0) temp = cur + seq[idx];
				else if (i == 1) temp = cur - seq[idx];
				else if (i == 2) temp = cur * seq[idx];
				else if (i == 3) temp = cur / seq[idx];
				
				dfs(temp, idx + 1);
				op[i]++;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		op = new int[4];
		visited = new boolean[N];
		seq = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			seq[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++)
			op[i] = Integer.parseInt(st.nextToken());
		
		dfs(seq[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);
	}
}
