package programmers;

import java.util.ArrayList;

public class RemoveSameData {

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 2, 2, 1};
		int[] result = solution(arr);
	}
	static int[] solution (int[] arr) {
		ArrayList<Integer> list = new ArrayList<>(); 
		
		list.add(arr[0]);
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i - 1]) list.add(arr[i]);
		}

		return list.stream().mapToInt(i -> i).toArray();

	}
}
