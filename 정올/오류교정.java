package com.js.pekah.algorithms.d0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 오류교정 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N][N];
		int count = 0;
		int check1 = 0;
		int check2 = 0;
		int pos1 = 0;
		int pos2 = 0;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) if (arr[i][j] == 1) count++;
			if (count % 2 != 0) {
				check1++;
				pos1 = i;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) if (arr[j][i] == 1) count++;
			if (count % 2 != 0) {
				check2++;
				pos2 = i;
			}
		}
		
		if (check1 == 0 && check2 == 0)
			System.out.println("OK");
		else if (check1 == 1 && check2 == 1)
			System.out.println("Change bit (" + (pos1+1) + "," + (pos2+1) + ")");
		else
			System.out.println("Corrupt");
	}
}
