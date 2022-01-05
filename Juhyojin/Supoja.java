package programmers;

import java.util.*;

public class Supoja {

	public static void main(String[] args) {
		int[] answer = {1, 2, 3, 4, 5};
		int[] result = solution(answer);
		
		for(int i : result) System.out.println(i);
	}
	static int[] solution(int[] answer) {
		int[] student1 = {1, 2, 3, 4, 5};
		int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] scores = {0, 0, 0};
		
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == student1[i % student1.length]) scores[0]++;
			if(answer[i] == student2[i % student2.length]) scores[1]++;
			if(answer[i] == student3[i % student3.length]) scores[2]++;
		}
		
		int max = Math.max(Math.max(scores[0], scores[1]), scores[2]);
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == max) list.add(i + 1);
		}
		
		return list.stream().mapToInt(i -> i).toArray();
	}
}
