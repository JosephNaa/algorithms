package com.ssafy.algorithm;

import java.util.Scanner;

class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			int [][] arr = new int[100][100];
			int tc = sc.nextInt();
			int answer = 0;
			int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					sum1 += arr[i][j];
				}
				if (sum1 > answer) {
					answer = sum1;
				}
				sum1 = 0;
			}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					sum2 += arr[j][i];
				}
				if (sum2 > answer) {
					answer = sum2;
				}
				sum2 = 0;
			}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (i == j) {
						sum3 += arr[i][j];
					}
					if (i == arr.length - j) {
						sum4 += arr[i][j];
					}
				}
				if (sum3 > answer) {
					answer = sum3;
				}
				if (sum4 > answer) {
					answer = sum4;
				}
				sum3 = 0;
				sum4 = 0;
			}
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
