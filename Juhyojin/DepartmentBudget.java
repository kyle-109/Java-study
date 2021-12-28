package programmers;

import java.util.Arrays;

public class DepartmentBudget {

	public static void main(String[] args) {
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
		System.out.print(solution(d, budget));
	}
	
	static int solution(int[] d, int budget) {
		int count = 0;
		
		Arrays.sort(d);
		
		for(int i : d) {
			if(i <= budget) {
				budget -= i;
				count++;
			} else break;
		}
		
		return count;
	}
}
