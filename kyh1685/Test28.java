import java.util.Arrays;

public class Test28 {
	public int[] solution(int []arr) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);

		for(int i = 1; arr.length > i; i++){
			if(arr[i-1] != arr[i]){
				list.add(arr[i]);
			}
		}

		int[] answer = new int[list.size()];

		for(int i = 0; list.size() > i; i++){
			answer[i] = list.get(i);
		}

		return answer;

//		for(int i = 1; arr.length > i; i++){
//			if(arr[i-1] == arr[i]){
//				arr[i-1] = -1;
//			}
//		}
//
//		return Arrays.stream(arr).filter(x -> x != -1).toArray();
	}
}
