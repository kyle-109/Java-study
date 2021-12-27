package programmers;

import java.util.*;

public class SumNumbers {

	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		int[] result = solution(numbers);
		
		for (int i : result) {
			System.out.print(i + " ");
		}
	}
	static int[] solution(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				System.out.println(sum);
				if(!list.contains(sum)) list.add(sum);
			}
		}
		
		Collections.sort(list);
		
		
		return list.stream().mapToInt(i -> i).toArray();
	}
}
