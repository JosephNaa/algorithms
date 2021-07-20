package com.js.pekah.algorithms;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int num = Integer.parseInt(n);
		int place = n.length();
		
		String temp = n.substring(0,1);
		for (int i = 0; i < place - 1; i++) {
			temp += "0";
		}
		
		int maxCon = Integer.parseInt(temp) - 1;
		temp = Integer.toString(maxCon);
		
		int sumCon = 0;
		for (int i = 0; i < temp.length(); i++) {
			sumCon += Character.getNumericValue(temp.charAt(i));
		}
		
		for (int i = num - sumCon; i < num; i++) {
			String tmp = Integer.toString(i);
			String[] strArray = tmp.split("");
			int minCon = i;
			for (String s : strArray) {
				minCon += Integer.parseInt(s);
			}
			
			if (minCon == num) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
	}
}
