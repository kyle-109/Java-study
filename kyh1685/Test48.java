
public class Test48 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for(int i = 0; absolutes.length > i; i++){
			answer = signs[i] == true ? answer + absolutes[i] : answer + absolutes[i] * -1;
		}

		return answer;
	}
}
