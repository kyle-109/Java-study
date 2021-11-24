import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main12 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		long y = Integer.parseInt(br.readLine());
		System.out.println(solution(y));
	}
	
	public static long solution(long n) {
		char arr[] = new char[10];
		String o = String.valueOf(n);
		String N = "";
		arr = o.toCharArray();
		Arrays.sort(arr);
		for(int i = arr.length-1; i >= 0; i--) {
			N += arr[i];
		}
		
		long answer = 0;
		answer = Long.parseLong(N);
		return answer;
	}
}
