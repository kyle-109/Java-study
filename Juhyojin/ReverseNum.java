package programmers;

import java.util.*;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.print(solution(125));
	}
	static int solution(int n) {
		int result = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		while(n > 0) {
			list.add(n % 3);
			n /= 3;
		}
		
		Collections.reverse(list);
		int temp = 1;
		
		for(int i : list) {
			result += temp * i;
			temp *= 3;
		}
		
		return result;
	}
}
