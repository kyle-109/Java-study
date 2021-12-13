import java.util.Arrays;

public class Test27 {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = new int[arr.length];
		int count = 0;
		int fail = 0;

		for(int i = 0; arr.length > i; i++){
			if(arr[i] % divisor == 0){
				answer[count] = arr[i];
				count++;
			}else{
				fail++;
			}
		}

		if(fail == arr.length){
			return new int[]{-1};
		}

		answer = Arrays.stream(answer).filter(x -> x != 0).toArray();
		Arrays.sort(answer);

		return answer;
	}
}
