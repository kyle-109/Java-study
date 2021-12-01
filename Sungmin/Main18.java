import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main18 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(solution(s) + 1);
	}
	
	public static int solution(String s) {
		int answer = 0;
		answer = Integer.parseInt(s);
		return answer;
	}
}
