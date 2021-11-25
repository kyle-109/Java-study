import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main15 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(solution(s));
	}
	
	public static String solution(String s) {
		StringBuffer sb = new StringBuffer();
		String answer = "";
		String arr[] = s.split(" ");
		answer += ' ';
		for(int i = 0; i < arr.length; i++) {
			for( int j = 0; j < arr[i].length(); j++) {
				if(j == 0 || j%2 ==0) {
					answer += (char)(arr[i].charAt(j) - 32);
				}
				else {
					answer += arr[i].charAt(j);
				}
			}
			if(arr.length-1 > i) {
				answer += ' ';
			}
			
		}
		
		return answer;
	}
}
