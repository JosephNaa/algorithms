package com.ssafy.algorithm;

import java.util.Scanner;

class Flatten {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			int dumpNum = sc.nextInt();
			int [] dumps = new int[100];
			int count = 0;
			int answer = 0;
			
			for (int i = 0; i < dumps.length; i++) {
				dumps[i] = sc.nextInt();
			}
			
			while (count < dumpNum) {
				int max = 0;
				int min = 1000;
				int maxIdx = 0;
				int minIdx = 0;
				
				for (int i = 0; i < dumps.length; i++) {
					if (dumps[i] > max) {
						max = dumps[i];
						maxIdx = i;
					}
				}
				
				for (int i = 0; i < dumps.length; i++) {
					if (dumps[i] < min) {
						min = dumps[i];
						minIdx = i;
					}
				}
				
				dumps[maxIdx]--;
				dumps[minIdx]++;
				
				count++;
			}
			
			int max = 0;
			int min = 1000;
			
			for (int i = 0; i < dumps.length; i++) {
				if (dumps[i] > max) max = dumps[i];
			}
			
			for (int i = 0; i < dumps.length; i++) {
				if (dumps[i] < min) min = dumps[i];
			}
			
			answer = max - min;
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
