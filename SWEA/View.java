package com.ssafy.algorithm;

import java.util.Scanner;
import java.io.FileInputStream;

class View {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++){
			int buildingNum = sc.nextInt();
			int [] buildings = new int[buildingNum];
			int answer = 0;
			
			for (int i = 0; i < buildings.length; i++) {
				buildings[i] = sc.nextInt();
			}
			
			for (int i = 2; i < buildings.length - 2; i++) {
				int checkL = Math.max(buildings[i-1], buildings[i-2]);
				int checkR = Math.max(buildings[i+1], buildings[i+2]);
				
				if (buildings[i] < checkL || buildings[i] < checkR) {
					continue;
				}
				
				int views = Math.max(checkL, checkR);
				answer += buildings[i] - views;
			}
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}