import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.println(solution(a));
	}
	
	public static int solution(int n) {
		int answer = 0;
		String s = Integer.toString(n);
		int arr[] = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i)-'0';
			answer += arr[i];
		}
		
		return answer;
	}
}
