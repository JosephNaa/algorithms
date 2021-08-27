package com.js.pekah.algorithms.d0825;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 12:37
// 13:15

public class 백만장자프로젝트 {
	static int N;
	static int arr[];
	static int max, count, sum, sell;
	static long profit;
	static int tmpArr[];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			max = Arrays.stream(arr).max().getAsInt();
			profit = 0;
			
			for (int i = 0; i < N; i++) {
				count = 0;
				sum = 0;
				sell = 0;
				while(arr[i] != max) {
					sum += arr[i];
					count++;
					i++;
				}
				
				sell = arr[i] * count;
				profit += sell - sum;

				if (i + 1 < arr.length) {
					tmpArr = Arrays.copyOfRange(arr, i + 1, arr.length);
					max = Arrays.stream(tmpArr).max().getAsInt();
				}
			}
			sb.append("#").append(tc).append(" ").append(profit).append("\n");
		}
		
		System.out.println(sb);
	}
}
