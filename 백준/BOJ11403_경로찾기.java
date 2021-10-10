package com.js.pekah.algorithms.d1010;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ11403_경로찾기 {
	static int N;
	static int arr[][];
	static int result[][];
	
	public static void solve(int start) {
		Queue<Integer> q = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			if (arr[start][i] == 1) q.add(i);
		}
		
		while (!q.isEmpty()) {
			int v = q.poll();
			arr[start][v] = 1;
			
			for (int i = 0; i < N; i++) {
				if (arr[v][i] == 1) {
					q.add(i);
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		result = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < N; i++) {
			solve(i);
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
