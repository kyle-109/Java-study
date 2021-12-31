
public class Test40 {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		Map<Integer, Double> map = new HashMap<>();
		int count = stages.length;

		for(int i = 1; N >= i; i++){
			int temp = 0;

			for(int j = 0; stages.length > j; j++){
				if(stages[j] == i){
					temp++;
				}
			}

			if(count == 0 && temp == 0){
				map.put(i, 0.0);
			}else {
				map.put(i, ((double)temp/(double)count));
			}
			count -= temp;
		}

		for(int i= 0; i < N; i++) {
			double max = -1;
			int maxKey = 0;

			for(Integer key : map.keySet()) {
				if(max < map.get(key)) {
					max = map.get(key);
					maxKey = key;
				}
			}
			answer[i] = maxKey;
			map.remove(maxKey);
		}

		return answer;
	}
}
