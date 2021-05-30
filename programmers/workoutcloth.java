public class workoutcloth {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        solution(n, lost, reserve);
    }

    private static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int [] students = new int[n];
        for(int i = 0; i < students.length; i++){
            students[i] = 1;
        }
        for(int i = 0; i < lost.length; i++){
            students[lost[i]-1] -= 1;
        }
        for(int i = 0; i < reserve.length; i++){
            students[reserve[i]-1] += 1;
        }
        for(int i = 0; i < students.length; i++){
            int back = 1;
            int front = 1;
            if(students[i] == 2){
                if(i == 0){
                    front = students[i+1];
                }else if(i == students.length-1){
                    back = students[i - 1];
                }else {
                    back = students[i - 1];
                    front = students[i + 1];
                }

                if(back == 0){
                    students[i-1] += 1;
                    students[i] -= 1;
                } else if(front == 0){
                    students[i+1] += 1;
                    students[i] -= 1;
                }
            }
        }
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
            if(students[i] != 0){
                answer += 1;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
