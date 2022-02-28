import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        int len = record.length;
        int idx = 0;
        int count = 0;
        HashMap <String, String> user = new HashMap();
        
        for (int i = 0; i < len; i++) {
            String[] splt = record[i].split("\\s+");
           
            if (splt[0].equals("Enter")) {
                user.put(splt[1], splt[2]);
                idx++;
            } else if (splt[0].equals("Change")) {
                user.put(splt[1], splt[2]);
            } else if (splt[0].equals("Leave")) {
                idx++;
            }
        }
        
        answer = new String[idx];
        
        for (int i = 0; i < len; i++) {
            String[] splt = record[i].split("\\s+");

            if (splt[0].equals("Enter")) {
                answer[count++] = user.get(splt[1]) + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
            } else if (splt[0].equals("Leave")) {
                answer[count++] = user.get(splt[1]) + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
            }
        }
        
        return answer;
    }
}