package com.js.pekah.algorithms.d1001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10816_숫자카드2 {
	static int N, M;
	static int arr[];
	static int find[];
	static int start, end, mid, result;
	
	public static int upper(int target) {
		start = 0;
		end = N;
		
		while(start < end) {
			mid = (start + end) / 2;
			
			if (arr[mid] > target) end = mid;
			else start = mid + 1;
		}
		
		return end;
	}
	
	public static int lower(int target) {
		start = 0;
		end = N;
		
		while (start < end) {
			mid = (start + end) / 2;
			
			if (arr[mid] >= target) end = mid;
			else start = mid + 1;
		}
	
		return end;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		M = Integer.parseInt(br.readLine());
		find = new int[M];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			find[i] = Integer.parseInt(st.nextToken());
			sb.append(upper(find[i]) - lower(find[i]) + " ");
		}
		
		System.out.println(sb);
	}
}
