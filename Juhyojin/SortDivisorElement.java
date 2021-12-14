package programmers;

import java.util.*;

public class SortDivisorElement {

	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int div = 5;
		int[] result = solution(arr, div);
	}
	
	static int[] solution(int[] arr, int divisor) {		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int num : arr) {
			if (num % divisor == 0)	list.add(num);
		}
		
		if (list.size() == 0) {
			int[] answer = {-1};
			return answer;
		} else {
			Collections.sort(list);
			int[] anwser = list.stream().mapToInt(i -> i).toArray();
			return anwser;
		}
	}
}
