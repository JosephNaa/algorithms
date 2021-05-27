public class method3 {
    public static void main(String[] args) {
        int n = 45;

        solution(n);
    }

    private static int solution(int n) {
        int answer = 0;
        StringBuilder builder = new StringBuilder();
        while(n >= 1){
            builder.insert(0, n % 3);
            n /= 3;
        }
        answer = Integer.parseInt(builder.reverse().toString(), 3);
        return answer;
    }
}
