import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        //스택을 사용한게 차이점.
        Stack<Integer> bucket = new Stack<Integer>(); // 인형을 쌓을 바구니
        
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                /* 인형이 없는 곳 */
	   //내 코드가 틀린 점: -1을 해야 indexOutofBound 발생하지 않는다.
                if (board[i][move-1] == 0) {
                    continue;
                } else {
                    /* 같은 모양의 인형 두 개 바구니에 연속해서 쌓이게 되는 경우 */
                    if (!bucket.isEmpty() && board[i][move-1] == bucket.peek()) {
                        answer += 2;  // 인형은 쌍으로 두개씩 사라짐
                        bucket.pop(); // 바구니에서 삭제
                    } else {
                        bucket.add(board[i][move-1]);
                    }
                    board[i][move-1] = 0; // 인형 뽑기
                                        
                    break;
                }
            }
        }
        
        return answer;
    }
}