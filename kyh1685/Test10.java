import java.util.Arrays;

public class Test10 {
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length];

		if(arr.length == 1){
			answer[0] = -1;
		}else{
			int min = Arrays.stream(arr).min().getAsInt();
			answer = Arrays.stream(arr).filter(a -> a != min).toArray();
		}
		return answer;
	}
}
