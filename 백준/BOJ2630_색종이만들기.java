package com.js.pekah.algorithms.d0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2630_색종이만들기 {
	static int N;
	static int arr[][];
	static int white;
	static int blue;
	
	public static void solve(int x, int y, int size) {
		if (size == 1) {
			if (arr[x][y] == 1) blue++;
			else white++;
			return;
		}
		
		boolean checkBlue = true;
		boolean checkWhite = true;
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (arr[i][j] != 1) checkBlue = false;
				if (arr[i][j] != 0) checkWhite = false;
			}
		}
		
		if (checkBlue) blue++;
		else if (checkWhite) white++;
		else {
			int mid = size / 2;
			solve(x, y, mid);
			solve(x, y+mid, mid);
			solve(x+mid, y, mid);
			solve(x+mid, y+mid, mid);
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		white = 0;
		blue = 0;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		solve(0, 0, N);
		
		System.out.println(white);
		System.out.println(blue);
	}
}
