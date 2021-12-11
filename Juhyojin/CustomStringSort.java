package programmers;

import java.util.*;

public class CustomStringSort {

	public static void main(String[] args) {
		String[] arr = {"sun","bed","car"};
		int num = 1;
		
		String[] result = solution(arr,num);
	}
	static String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2){
				if(s1.charAt(n) > s2.charAt(n)) return 1;
	            else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
	            else if(s1.charAt(n) < s2.charAt(n)) return -1;
	            else return 0;
	          }
			});
		return strings;
	}
}
