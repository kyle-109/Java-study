package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeleteMinNum {

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1};
		arr = solution(arr);
		System.out.print(Arrays.toString(arr));
	}
	
	static int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for(int index : arr) list.add(index);
		list.remove(Collections.min(list));
		
		int[] result = new int[list.size()];
		
		if(list.isEmpty()) {
			int[] empty = {-1};
			return empty;
		} else {
			for (int i = 0 ; i < result.length ; i++) {
				result[i] = list.get(i).intValue();
			}
		}
		
		return result;
	}
}
