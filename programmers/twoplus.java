import java.util.*;

public class twoplus {

    public static int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(1));
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};

        solution(numbers);
    }
}