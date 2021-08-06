package com.ssafy.algorithm.d0805;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최대상금 {
	public static int numArr[];
	public static int result;
	public static int time;
	
	public static void selectionSort(int s, int e) {
		if (e == time) {
			result = Math.max(result, Integer.parseInt(Arrays.toString(numArr).replaceAll("[^0-9]", "")));
			return;
		}
		
		for (int i = s; i < numArr.length - 1; i++) {
			for (int j = i + 1; j < numArr.length; j++) {
				int t;
				t = numArr[i];
				numArr[i] = numArr[j];
				numArr[j] = t;
				
				selectionSort(i, e + 1);
				
				t = numArr[i];
				numArr[i] = numArr[j];
				numArr[j] = t;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int tc = Integer.parseInt(br.readLine());
		
		for (int test_case = 1; test_case <= tc; test_case++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			numArr = new int[str.length()];
			result = 0;
			
			for (int i = 0; i < str.length(); i++) 
				numArr[i] = str.charAt(i) - '0';
			
			time = Integer.parseInt(st.nextToken());
			time = time > str.length() ? str.length() - 1 : time;
			
			selectionSort(0, 0);
			
			bw.write("#" + test_case + " " + result);
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
