package com.js.pekah.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 영화감독숌 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int input = Integer.parseInt(br.readLine());
    	int count = 0;
    	int checkCount = 0;
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	while (true) {
    		String check666 = Integer.toString(count);
    		if (check666.contains("666")) {
    			checkCount++;
    			if (checkCount == input) {
    				System.out.println(count);
    				break;
    			}
    		}
    		count++;
    	}
	}
}
