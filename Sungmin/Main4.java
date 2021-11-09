import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		System.out.print(solution(N));
		
	}
	
	static String solution(String phone_number) {
		StringBuilder sb = new StringBuilder();
		int length = phone_number.length();
		String answer = "";
		for(int i = 0; i< length-4;i++) {
			answer += "*";
		}
		answer = answer + phone_number.substring(length-4, length);
		return answer;
	}
}
