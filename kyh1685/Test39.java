
public class Test39 {
	public int solution(int left, int right) {
		int answer = 0;

		for(int i = left; right >= i; i++){
			int count = 0;

			for(int j = 1; i >= j; j++){
				if(i % j == 0){
					count++;
				}
			}
			answer = count % 2 == 0 ? answer + i : answer - i;
		}

		return answer;
	}
}
