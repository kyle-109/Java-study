import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long answer[] = new long[1001];
		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i <= n ; i++) {
			answer[i] = answer[i-1] + x;
			if(i < n) {
				System.out.print(answer[i] + ",");
			}
			else {
				System.out.print(answer[i]);
			}
		}
	}
}
