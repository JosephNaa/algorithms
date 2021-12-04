package com.js.pekah.algorithms.d1204;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// 16:10 ~ 16:27

public class BOJ2920_음계 {
	static Integer input[];
	static Integer sortedInput[];
	static Integer reversedInput[];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		input = new Integer[8];
		sortedInput = new Integer[8];
		reversedInput = new Integer[8];
		
		for (int i = 0 ; i < 8; i++) {
			sortedInput[i] = Integer.parseInt(st.nextToken());
		}
		
		input = sortedInput.clone();
		Arrays.sort(sortedInput, Collections.reverseOrder());
		reversedInput = sortedInput.clone();
		Arrays.sort(sortedInput);
		
		if (Arrays.equals(input, sortedInput)) {
			System.out.println("ascending");
		} else if (Arrays.equals(input, reversedInput)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
