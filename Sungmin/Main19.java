import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main19 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}
	public static String solution(int n) {
		String answer = "";
		for(int i = 0; i< n; i++) {
			if(i == 0 || i%2 ==0) {
				answer += "¼ö";
			}
			else {
				answer += "¹Ú";
			}
		}
		return answer;
	}
}
