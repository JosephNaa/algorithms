package com.js.pekah.algorithms.d1226;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ16953_AtoB_나요셉 {
	static long a, b;
	static long result;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		result = 1;
		
		while (a != b) {
			if (b < a) {
				System.out.println(-1);
				System.exit(0);
			}
			
			if (b % 10 == 1) b /= 10;
			else if (b % 2 == 0) b /= 2;
			else {
				System.out.println(-1);
				System.exit(0);
			}
			
			result++;
		}
		
		System.out.println(result);
	}
}
