package com.js.pekah.algorithms.d1206;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 23:31 ~ 23:37

public class BOJ1874_스택수열 {
	static int count = 1;
	static int num;
	static int arr[];
	static int top;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			num = Integer.parseInt(br.readLine());
			
			while (count <= num) {
				arr[top++] = count++;
				sb.append("+\n");
			}
			
			if (arr[top-1] == num) {
				top--;
				sb.append("-\n");
			} else {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println(sb);
	}
}
