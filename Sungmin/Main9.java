import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(solution(N));
	}
	
	public static String solution(int num) {
		String answer = "";
		if(num % 2 == 0) {
			answer = "Even";
		}
		else {
			answer = "Odd";
		}
		return answer;
	}
}
