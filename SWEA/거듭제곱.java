package com.ssafy.algorithm.d0729;

import java.util.Scanner;

public class 거듭제곱 {
	public static int tc;
	public static int num;
	public static int times;
	
	public static int power(int t) {
		if (t == 0) return 1;
		return num * power(t-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int test_case = 0; test_case < 10; test_case++) {
			tc = sc.nextInt();
			num = sc.nextInt();
			times = sc.nextInt();
			
			System.out.println("#" + tc + " " + power(times));
		}
	}
}
