import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		System.out.println(solution(x));
	}
	static boolean solution(int x) {
		boolean answer = true;
		int length = (int)(Math.log10(x)+1);
		int sum = 0;
		int y = x;
		for(int i = 0; i < length; i++) {
			sum += y%10;
			y /= 10;
		}
		if(x%sum != 0) {
			answer = false;
		}
		return answer;
	}
}
