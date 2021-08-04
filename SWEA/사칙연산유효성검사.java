package com.ssafy.algorithm.d0803;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 사칙연산유효성검사 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			int len = Integer.parseInt(br.readLine());
			int result = 1;
			
			for (int i = 0; i < len; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				String op = st.nextToken();
				if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && st.hasMoreTokens()) 
					result = 0;
			}
			System.out.println("#" + test_case + " " + result);
		}
	}
}
