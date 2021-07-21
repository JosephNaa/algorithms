package com.js.pekah.algorithms;

import java.util.Scanner;

public class 설탕배달2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int result = 0;
		int [] numArr = {-1, -1, 1, -1, 1, 2, -1};
		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23
		// -1,-1,1,-1, 1, 2,-1, 2, 3, 2,  3,  4,  3,  4,  3,  4,  5,  4,  5,  4,  5,  6,  5
		if (x < 8) {
			System.out.println(numArr[x-1]);
			return;
		}
		
		result = x / 5 + (x % 5);
		if ( x % 5 >= 3 ) result -= 2;
		
		System.out.println(result);
		
	}
}
