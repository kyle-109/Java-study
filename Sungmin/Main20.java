import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main20 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(n));
	}
	public static int solution(int n) {
		int arr[] = new int[n+1];
		int answer = 0;
		for(int i= 0; i <= n; i++) {
			arr[i] = 1;
		}
		for(int i = 2; i<= n; i++) {
			if(arr[i] == 0) {
				continue;
			}
			for(int j = i + i; j <= n; j += i) {
				arr[j] = 0;
			}
		}
		for(int i = 2; i<=n; i++) {
			if(arr[i] != 0) {
				answer++;
			}
		}
		return answer;
	}
}
