
public class Test54 {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int zero = 0;
		int correct = 0;

		List<Integer> list = new ArrayList<>();
		for(int win : win_nums){
			list.add(win);
		}

		for(int lotto : lottos){
			if(lotto == 0){
				zero++;
			}else if(list.contains(lotto)){
				correct++;
			}
		}

		if(zero == 0 && correct == 0) zero++;

		answer[0] = correct > 0 ? 7 - (zero + correct) : 7 - zero;
		answer[1] = correct > 0 ? 7 - correct : 6;

		return answer;
	}
}
