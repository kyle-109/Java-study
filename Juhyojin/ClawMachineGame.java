public class ClawMachineGame {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0},
                         {0, 0, 1, 0, 3},
                         {0, 2, 5, 0, 1},
                         {4, 2, 4, 4, 2},
                         {3, 5, 1, 3, 1}};

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println("return : " + solution(board, moves));
    }
    static int solution (int[][] board, int[] moves) {
        int answer = 0;
        int[] stacks = new int[moves.length];
        int stackIndex = 0;
        for(int i = 0; i < moves.length; i++) {
            int index = moves[i] - 1;
            System.out.println("index : " + index);
            for(int j = 0; j < board.length; j++){
                if(board[j][index] != 0) {
                    System.out.println("stacks : " + board[j][index]);
                    stacks[stackIndex] = board[j][index];
                    board[j][index] = 0;
                    if (stackIndex == moves.length) return answer;
                    else if (stackIndex != 0 && stacks[stackIndex] == stacks[stackIndex - 1]) {
                        answer += 2;
                        stackIndex -= 2;
                    }

                    stackIndex++;
                    break;
                }
            }
        }
        return answer;
    }
}
