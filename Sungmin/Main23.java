import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main23 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(solution(s));
	}
	public static String solution(String s) {
        String answer = "";
        char arr[] = new char[s.length()];
  
        for(int i = 0; i< s.length(); i++) {
        	arr[i] = s.charAt(i);
        }
        
        Arrays.sort(arr);
        
        for(int i = arr.length-1; i >= 0; i--) {
        	answer += String.valueOf(arr[i]);
        }
        return answer;
    }
}
