package com.js.pekah.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class 설탕배달 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int [] sugar = {3, 5};
		int [] numArr = new int[input + 1];
		Arrays.fill(numArr, input);
		
		for (int i = 1; i < input + 1; i++) {
			for (int s : sugar) {
				if (s < i && numArr[i-s] + numArr[s] < numArr[i]) {
					numArr[i] = numArr[i-s] + numArr[s];
				} else if (s == i) {
					numArr[i] = 1;
				}
			}
		}
		int answer  = numArr[numArr.length - 1];
		if (answer == input) {
			System.out.println(-1);
		} else {
			System.out.println(answer);
		}
	}
}
