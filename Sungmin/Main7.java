import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(solution(N));
	}
	
	static int solution(double num) {
		int answer = 0;
		int count = 0;
		while(num > 1 && count <= 500) {
			if(num%2 == 0) {
				num = num/2;
			}
			else {
				num = (num*3)+1;
			}
			count++;
			answer = count;
			if(count > 500) {
				answer = -1;
			}
		}

		return answer;
	}
}
