public class Test16 {
	public int solution(int n) {
		int answer = 0;

		for(int i = 1; n >= i; i++){
			if(n % i == 0){
				answer += i;
			}
		}

		return answer;
	}
}
