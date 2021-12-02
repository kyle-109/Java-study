public class Test19 {
	public String solution(int n) {
		String answer = "";

		for(int i = 1; n >= i; i++){
			answer += i % 2 != 0 ? "수" : "박";
		}

		return answer;
	}
}
