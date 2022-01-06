package programmers;

import java.util.*;

public class NumberK {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = solution(array, commands);
		for(int num : result) System.out.println(num);
	}
	
	static int[] solution(int[] array, int[][] commands) {
		ArrayList<Integer> list = new ArrayList<>();
		int[] result = new int[commands.length]; 
		int temp = 0;
		
		for(int i = 0; i < commands.length; i++) {
			for(int j = commands[i][0]; j <= commands[i][1]; j++) {
				list.add(array[j-1]);
			}
			Collections.sort(list);
			result[i] = list.get(commands[i][2]-1);
			list.clear();
		}
		
		return result;
	}
}
