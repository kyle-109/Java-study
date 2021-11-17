public class Test08 {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		int temp = 0;

		if(max % min == 0){
			answer[0] = min;
			answer[1] = max;
		}else{
			while (max % min != 0){
				temp = max % min;
				max = min;
				min = temp;
			}
			answer[0] = min;
			answer[1] = (n * m) / min;
		}
		return answer;
	}
}
