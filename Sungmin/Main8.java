import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main8 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.print(Arrays.toString(solution(a,b)));
		
	}
	
	static int[] solution(int n, int m) {
		int answer[] = new int[2];
		int big = Math.max(n, m);
		int small = Math.min(n, m);
		answer[0] = algo(big, small);
		answer[1] = algo2(big, small);
		return answer;
	}
	
	static int algo(int a, int b) {
		if(b == 0) {
			return a;
		}
		return algo(b, a%b);
	}
	
	static int algo2(int a, int b) {
		return a*b / algo(a, b);
	}
}
