import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main26 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println(solution(a,b));
	}
	
	public static long solution(int a, int b) {
        long answer = 0;
        int d = Math.max(a, b);
        int c = Math.min(a, b);
        for(int i = c; i <= d; i++) {
        	answer += i;
        }
        
        return answer;
    }
}
