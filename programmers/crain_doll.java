import sun.rmi.server.InactiveGroupException;

import java.util.Stack;

public class crain_doll {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}};

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        solution(board, moves);
    }

    private static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int pick;
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.println("board: " + board[j][moves[i]-1]);
                pick = board[j][moves[i]-1];
                if (pick != 0) {
                    if (!stack.isEmpty()) {
                        if (stack.peek() == pick) {
                            stack.pop();
                            System.out.println("stack.pop: " + stack);
                            answer += 2;
                        }
                        else{
                            stack.push(pick);
                            System.out.println("stack.push: " + stack);
                        }
                    }
                    else{
                        stack.push(pick);
                        System.out.println("stack.push: " + stack);
                    }

                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        System.out.println("answer: " + answer);
        return answer;
    }
}
