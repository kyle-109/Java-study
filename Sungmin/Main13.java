import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main13 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Integer.parseInt(br.readLine());
		System.out.println(Arrays.toString(solution(a)));
	}

	public static int[] solution(long n) {
		String N = Long.toString(n);
		int arr[] = new int[N.length()];
		int[] answer = new int[N.length()];
		for(int i = 0; i < N.length(); i++) {
			arr[i] = N.charAt(i);
		}
		
		for(int i = N.length()-1 , j = 0; i >= 0; i--, j++) {
			answer[j] = arr[i]-'0';
		}
		
		
		return answer;
	}
}
