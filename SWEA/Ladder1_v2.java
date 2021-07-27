package com.ssafy.algorithm;

import java.util.Scanner;

class Ladder1_v2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int left = 1, right = 2, up = 3;
		int x = 0, y = 0;
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			int tc = sc.nextInt();
			int [][] ladders = new int[100][100];
			int flag = up;
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					ladders[i][j] = sc.nextInt();
					if (ladders[i][j] == 2) {
						y = i-1;
						x = j;
					}
				}
			}
			
			while(y > 0) {
				if (flag == up) {
					if (x-1 >= 0 && ladders[y][x-1] == 1) {
						x--;
						flag = left;
					} else if (x+1 < 100 && ladders[y][x+1] == 1) {
						x++;
						flag = right;
					} else {
						y--;
					}
				}
				else if (flag == right) {
					if (x+1 < 100 && ladders[y][x+1] == 1) {
						x++;
					} else {
						y--;
						flag = up;
					}
				}
				else {
					if (x-1 >= 0 && ladders[y][x-1] == 1) {
						x--;
					} else {
						y--;
						flag = up;
					}
				}
			}
			
			System.out.println("#" + tc + " " + x);
		}
	}
}
