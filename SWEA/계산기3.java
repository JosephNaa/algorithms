package com.ssafy.algorithm.d0730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 계산기3 {
	
	public static int[] opStack = new int[10000];
	public static char[] stack = new char[10000];
	public static char[] calcs;
	public static int top;
	public static int opTop;
	public static int ans;
	
	public static String postCalc() {
		String postTmp = "";
		
		for (int i = 0; i < calcs.length; i++) {
			switch(calcs[i]) {
			case '(': 
				stack[++top] = calcs[i];
				break;
			case '+':
				while (stack[top] == '*' || stack[top] == '+') postTmp += stack[top--];
				stack[++top] = calcs[i];
				break;
			case '*':
				while (stack[top] == '*') postTmp += stack[top--];
				stack[++top] = calcs[i];
				break;
			case ')':
				while(stack[top] != '(') postTmp += stack[top--];
				top--;
				break;
			default:
				postTmp += calcs[i];
				break;
			}
		}
		
		return postTmp;
	}
	
	public static int Calc3(String postTmp) {
		for (int i = 0; i < postTmp.length(); i++) {
			char sth = postTmp.charAt(i);
			if (sth != '+' && sth != '*') opStack[++opTop] = sth - '0';
			else {
				int num2 = opStack[opTop--];
				int num1 = opStack[opTop--];
				
				if (sth == '+') opStack[++opTop] = num1 + num2;
				else if (sth == '*') opStack[++opTop] = num1 * num2;
			}
		}
		return opStack[opTop];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			st = new StringTokenizer(br.readLine());
			int tc = Integer.parseInt(st.nextToken());
			calcs = new char[tc];
			top = -1;
			opTop = -1;
			calcs = br.readLine().toCharArray(); 
			
			System.out.println("#" + test_case + " " + (Calc3(postCalc())));
		}
	}
}
