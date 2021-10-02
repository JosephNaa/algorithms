package com.js.pekah.algorithms.d1002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2512_예산 {
	static int N, M;
	static int arr[];
	static int start, end, mid, result, budget;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		M = Integer.parseInt(br.readLine());
		
		start = 0;
		end = arr[N-1];
		
		while (start <= end) {
			mid = (start + end) / 2;
			budget = 0;
			
			for (Integer b : arr) {
				if (b >= mid) budget += mid;
				else budget += b;
			}
			
			if (budget > M) {
				end = mid - 1;
			} else {
				start = mid + 1;
				result = Math.max(result, mid);
			}
		}
		
		System.out.println(result);
	}
}
