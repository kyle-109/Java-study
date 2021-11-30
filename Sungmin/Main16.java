import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main16 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		System.out.println(solution(y));
	}
	
	public static int solution(int n) {
		int answer = 0;
		int arr1[] = new int[n+1];
		int arr2[] = new int[n+1];
		for(int i = 1; i<=n; i++) {
			arr1[i] = i;
		}
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=n; j++) {
				if(arr1[i]* arr1[j] == n) {
					arr2[arr1[i]]++;
					arr2[arr1[j]]++;
				}
			}
		}
		for(int i=1; i<=n; i++) {
			if(arr2[i] > 0) {
				answer += i;
			}
		}
		return answer;
	}
}
