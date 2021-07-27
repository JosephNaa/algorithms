package com.ssafy.algorithm;

import java.util.Scanner;

class Ladder1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int left = 1, right = 2, down = 3;
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			int tc = sc.nextInt();
			int [][] ladders = new int[100][100];
			int answer = 0;
			int flag = 0;
			
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					ladders[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < ladders.length; i++) {
				int x = i, y = 0;
				flag = down;
				if (ladders[0][i] == 1) {
					y++;
					while (y < 100) {
						if (ladders[y][x] == 2) {
							answer = i;
							break;
						}
						if (flag == down) {
							if (x-1 >= 0 && ladders[y][x-1] == 1) {
								x--;
								flag = left;
							} else if (x+1 < 100 && ladders[y][x+1] == 1) {
								x++;
								flag = right;
							} else {
								y++;
								flag = down;
							}
						} else if (flag == right) {
							while(x < 100 && ladders[y][x] == 1) {
								x++;
							}
							x--;
							y++;
							flag = down;
						} else {
							while (x >= 0 && ladders[y][x] == 1) {
								x--;
							}
							x++;
							y++;
							flag = down;
						}
					}
				}
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}
