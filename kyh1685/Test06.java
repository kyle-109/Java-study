public class Test06 {
	public double solution(int[] arr) {
		double answer = 0;
		int size = arr.length;
		int sum = 0;

		for(int i = 0; size > i; i++){
			sum += arr[i];
		}

		answer = (double)sum/size;

		return answer;
	}
}
