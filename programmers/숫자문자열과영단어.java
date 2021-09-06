package com.js.pekah.algorithms.d0906;

public class 숫자문자열과영단어 {

}

class Solution {
    static String str[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public int solution(String s) {
        
        for (int i = 0; i < 10; i++) {
            s = s.replace(str[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}