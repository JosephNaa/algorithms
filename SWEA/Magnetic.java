package com.ssafy.algorithm;

import java.util.Scanner;

class Magnetic {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			int [][] mag = new int [100][100];
			int tc = sc.nextInt();
			int answer = 0;
			
			for (int i = 0; i < mag.length; i++) {
				for (int j = 0; j < mag.length; j++) {
					mag[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < mag.length; i++) {
				for (int j = 0; j < mag.length; j++) {
					if (mag[i][j] == 0) continue;
					else if (mag[i][j] == 1) {
						if (i + 1 == mag.length) break;
						if (mag[i+1][j] == 2) {
							answer++;
						} else {
							mag[i+1][j] = mag[i][j];
						}
					}
				}
			}
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
