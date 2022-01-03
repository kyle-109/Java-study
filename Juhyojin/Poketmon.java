package programmers;

import java.util.*;

public class Poketmon {

	public static void main(String[] args) {
		int[] nums = {3, 1, 2, 3};
		System.out.print(solution(nums));
	}
	static int solution(int[] nums) {
		int half = nums.length / 2;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int num : nums) if(!list.contains(num)) list.add(num);
		
		return list.size() > half ? half : list.size();
	}

}
