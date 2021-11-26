package com.js.pekah.algorithms.d1126;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2775_부녀회장이될테야 {
	static int arr[][];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		arr = new int[15][15];
		
		for (int tc = 0; tc < t; tc++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < 15; i++) {
				arr[i][1] = 1;
				arr[0][i] = i;
			}
			
			for (int i = 1; i < 15; i++) {
				for (int j = 2; j < 15; j++) {
					arr[i][j] = arr[i][j-1] + arr[i-1][j];
				}
			}
			
			System.out.println(arr[k][n]);
		}
	}
}
