package com.ssafy.algorithm.d0804;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 단순2진암호코드 {
	static String passwords;
	static String codes[] = {
			"0001101", // 0
			"0011001", // 1
			"0010011", // 2
			"0111101", // 3
			"0100011", // 4
			"0110001", // 5
			"0101111", // 6
			"0111011", // 7
			"0110111", // 8
			"0001011"  // 9
	};
	static int sum[] = new int[9];
	
	public static int Verification() {
		int n1 = 0, n2 = 0;
		
		for (int i = 1; i < sum.length; i++) {
			if (i % 2 == 1) n1 += sum[i];
			else if (i % 2 == 0) n2 += sum[i];
		}
		
		if (((n1 * 3) + n2) % 10 == 0) return n1 + n2;
		else return 0;
	}
	
	public static int Encode() {
		int idx = 8;
		
		for (int i = passwords.length() - 1; i > 0; i--) {
			if (passwords.charAt(i) != '0') {
				passwords = passwords.substring(0, i + 1);
				break;
			}
		}
	
		for (int i = passwords.length(); i > 7; i--) {
			String temp = passwords.substring(i - 7, i);
			if (Arrays.asList(codes).contains(temp)){
				passwords = passwords.substring(0, i - 7);
				sum[idx--] = Arrays.asList(codes).indexOf(temp);
				i = passwords.length() + 1;
			}
		}
		
		return Verification();
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			passwords = "";
			
			for (int i = 0; i < N; i++) {
				boolean flag = false;
				String str = br.readLine();
				for (int k = 0; k < M; k++)
					if (str.charAt(k) == '1') {
						flag = true;
						break;
					}
				
				if (flag) for (int j = 0; j < M; j++) passwords = str;
			}
			
			System.out.println("#" + test_case + " " + Encode());
		}
	}
}
