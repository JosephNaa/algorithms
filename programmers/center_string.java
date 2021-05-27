public class center_string {
    public static void main(String[] args) {
        String s = "abcde";

        solution(s);
    }

    private static String solution(String s) {
        String answer = "";

        if(s.length() % 2 == 0){
            answer = s.substring(s.length()/2 - 1, s.length()/2 + 1);
        } else{
            answer = s.substring(s.length()/2, s.length()/2 + 1);
        }
        return answer;
    }
}
