import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr1[] = {1,2,3,4};
		System.out.println(solution(arr1));
	}
	
    static double solution(int[] arr) {
		double sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		double answer = 0;
		answer = sum/arr.length;
		return answer;
	}
}
