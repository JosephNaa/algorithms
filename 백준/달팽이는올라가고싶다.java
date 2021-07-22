package com.js.pekah.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class 달팽이는올라가고싶다 {
//    public static void main(String[] args) throws IOException {
//    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	String [] input = br.readLine().split(" ");
//    	
//    	int a = Integer.parseInt(input[0]);
//    	int b = Integer.parseInt(input[1]);
//    	double v = Double.parseDouble(input[2]) - b;
//        
//        System.out.println((int)Math.ceil( v / ( a - b )));
//    }
//}

public class 달팽이는올라가고싶다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String [] input = br.readLine().split(" ");
		
    	int a = Integer.parseInt(input[0]);
    	int b = Integer.parseInt(input[1]);
    	int v = Integer.parseInt(input[2]);

		int count = (v - b) / (a - b);
		if ((v - b) % (a - b) != 0) {
			count++;
		}
		
		System.out.println(count);
	}
}