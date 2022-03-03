package com.js.pekah.algorithms.d220303;

import java.util.*;

public class 단체사진찍기 {
	static String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
    static boolean[] checked;
    static Stack<String> st;
    static int answer;
    
	public static void main(String[] args) {
		int n = 2;
		String[] data = {"N~F=0", "R~T>2"};
		
		System.out.println(solution(n, data));
	}
	
	public static boolean check(String[] data) {
		boolean c = false;
        for (String d : data) {
        	
            int a = st.indexOf(String.valueOf(d.charAt(0)));
            int b = st.indexOf(String.valueOf(d.charAt(2)));
            char op = d.charAt(3);
            int diff = d.charAt(4) - '0';
            
            if (op == '=') {
                if (!(Math.abs(a - b) == diff+1)) {
                	return false;
                }
            } else if (op == '<') {
                if (!(Math.abs(a - b) < diff+1)) {
                	return false;
                }
            } else if (op == '>') {
                if (!(Math.abs(a - b) > diff+1)) {
                	return false;
                }
            }
        }
        
        return true;
    }
    
    public static void permutation(String[] data) {
        if (st.size() == 8) {
            if (check(data)) answer++;
            
            return;
        }
        
        for (int i = 0; i < 8; i++) {
            if (!checked[i]) {
                checked[i] = true;
                st.push(friends[i]);
                permutation(data);
                st.pop();
                checked[i] = false;
            }
        }
    }
    
    public static int solution(int n, String[] data) {
        answer = 0;
        checked = new boolean[8];
        st = new Stack<>();

        permutation(data);
        
        return answer;
    }
}
