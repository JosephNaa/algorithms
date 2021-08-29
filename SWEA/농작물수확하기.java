package com.js.pekah.algorithms.d0827;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 농작물수확하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int arr[][] = new int[N][N];
			int result = 0;
			
			for (int i = 0; i < N; i++) {
				String str = br.readLine();
				for (int j = 0; j < N; j++) {
					arr[i][j] = str.charAt(j) - '0';
				}
			}
			
			int mid = N / 2;
			int midL = mid;
			int midR = mid;
			
			for (int i = 0; i < N; i++) {
				for (int j = midL; j <= midR; j++) {
					result += arr[i][j];
				}
				if (i < mid) {
					midL--;
					midR++;
				} else {
					midL++;
					midR--;
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}
	}
}
