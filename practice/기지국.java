package com.js.pekah.algorithms.d0829;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 20:00 ~ 20:33

public class 기지국 {
	static int N;
	static char arr[][];
	static int times;
	static int result;
	
	public static void search(int r, int c) {
		
		if (arr[r][c] == 'A') times = 1;
		else if (arr[r][c] == 'B') times = 2;
		else if (arr[r][c] == 'C') times = 3;
		
		for (int i = 1; i <= times; i++) {
			if (r - i >= 0 && arr[r-i][c] == 'H') arr[r-i][c] = 'X';
			if (r + i < N && arr[r+i][c] == 'H') arr [r+i][c] = 'X';
			if (c - i >= 0 && arr[r][c-i] == 'H') arr[r][c-i] = 'X';
			if (c + i < N && arr[r][c+i] == 'H') arr[r][c+i] = 'X';
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			arr = new char[N][N];
			result = 0;
			
			for (int i = 0; i < N; i++) {
				String str = br.readLine();
				for (int j = 0; j < N; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] != 'X' && arr[i][j] != 'H') {
						search(i, j);
					}
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 'H') result++;
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}
}
