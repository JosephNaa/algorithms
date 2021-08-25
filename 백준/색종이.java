package com.js.pekah.algorithms.d0824;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 19:17
// 19:38

public class 색종이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[1001][1001];
		int result[] = new int[101];
		
		for (int k = 1; k <= N; k++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			for (int i = x; i < x + w; i++) {
				for (int j = y; j < y + h; j++) {
					arr[i][j] = k;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				result[arr[i][j]]++;
			}
		}
		
		for (int i = 1; i <= N; i++) {
			System.out.println(result[i]);
		}
	}
}
