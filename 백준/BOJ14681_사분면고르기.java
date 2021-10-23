package com.js.pekah.algorithms.d1023;

import java.util.Scanner;

public class BOJ14681_사분면고르기 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 0;
		
		if (x > 0) {
			if (y > 0) result = 1;
			else result = 4;
		} else {
			if (y > 0) result = 2;
			else result = 3;
		}
		
		System.out.println(result);
	}
}
