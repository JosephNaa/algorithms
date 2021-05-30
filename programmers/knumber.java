import java.util.Arrays;

public class knumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},
                            {4, 4, 1},
                            {1, 7, 3}};

        solution(array, commands);
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;

        for(int[] i: commands){
            int[] result = Arrays.copyOfRange(array, i[0]-1, i[1]);
            Arrays.sort(result);
            answer[cnt++] = result[i[2]-1];
        }

        return answer;
    }
}
