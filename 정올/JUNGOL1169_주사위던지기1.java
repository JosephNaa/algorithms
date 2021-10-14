package com.js.pekah.algorithms.d1014;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JUNGOL1169_주사위던지기1 {
	static int n, m;
	static int path[];
	static int used[];
	
	public static void print() {
		for (int i = 0; i < n; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}
	
	public static void run1(int lev) {
		if (lev == n) {
			print();
			return;
		}
		
		for (int i = 1; i <= 6; i++) {
			path[lev] = i;
			run1(lev + 1);
		}
	}
	
	public static void run2(int lev, int start) {
		if (lev == n) {
			print();
			return;
		}
		
		for (int i = start; i <= 6; i++) {
			path[lev] = i;
			run2(lev + 1, i);
		}
	}
	
	public static void run3(int lev) {
		if (lev == n) {
			print();
			return;
		}
		
		for (int i = 1; i <= 6; i++) {
			if (used[i] == 1) continue;
			used[i] = 1;
			path[lev] = i;
			run3(lev + 1);
			used[i] = 0;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		path = new int[10];
		used = new int[10];
		
		if (m == 1) run1(0);
		if (m == 2) run2(0, 1);
		if (m == 3) run3(0);
	}
}
