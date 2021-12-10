import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main25 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		String arr[] = new String[tc];
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solution(arr, n));
		
	}
	public static String[] solution(String[] strings, int n) {
		String[] answer = {}; 
		ArrayList<String> arr = new ArrayList<>(); 
		for (int i = 0; i < strings.length; i++) { 
			arr.add("" + strings[i].charAt(n) + strings[i]); 
		} 
		Collections.sort(arr); 
		answer = new String[arr.size()]; 
		for (int i = 0; i < arr.size(); i++) { 
			answer[i] = arr.get(i).substring(1, arr.get(i).length()); 
		} 
		return answer;

    }
}
