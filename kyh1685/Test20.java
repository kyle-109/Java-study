public class Test20 {
	public int solution(int n) {
		int answer = 0;
		boolean[] arr = new boolean[n+1];

		// 2부터 n번째 수를 true로 초기화
		for(int i = 2; n >= i; i++){
			arr[i] = true;
		}

		// n의 제곱근을 구하기
		int root = (int)Math.sqrt(n);

		// n의 제곱근보다 i가 작은 만큼 반복
		// 소수의 배수는 소수가 아니므로 arr[i]번째가 true 일때 i의 배수가 n 구간 안에 있을 경우 false로 변경
		for(int i = 2; root >= i; i++){
			if(arr[i] ==  true){
				for(int j = i; n >= i*j; j++){
					arr[i*j] = false;
				}
			}
		}

		// arr[i]가 true(소수)인 것을 찾아서 더해준다.
		for(int i = 2; n >= i; i++){
			if(arr[i] == true){
				answer++;
			}
		}

		return answer;
	}
}
