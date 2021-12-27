
public class Test37 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);

		for(int i = 0; d.length > i; i++){
			if(budget >= 0 && budget - d[i] >= 0){
				budget -= d[i];
				answer++;
			}
		}

		return answer;
	}
}
