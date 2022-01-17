
public class Test50 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();

		for(int i = 0; moves.length > i; i++){
			for(int j = 0; board.length > j; j++){
				if(board[j][moves[i] - 1] != 0){
					if(list.size() != 0 && board[j][moves[i] - 1] == list.get(list.size() - 1)){
						list.remove(list.size() - 1);
						answer += 2;
					}else{
						list.add(board[j][moves[i] - 1]);
					}
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}

		return answer;
	}
}
