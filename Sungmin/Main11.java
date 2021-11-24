import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long x = Integer.parseInt(br.readLine());
		System.out.println(solution(x));
	}
	
	public static long solution(long n) {
		long answer = -1;
		for(int i = 2; i< n; i++) {
			if(n/i == i && n%i == 0) {
				answer = (i+1)*(i+1);
			}
		}
		
		
		return answer;
	}
}
