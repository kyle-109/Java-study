import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main27 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int arr[] = new int[tc];
		for(int i = 0; i < tc; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int divisor = Integer.parseInt(br.readLine());
		System.out.println(Arrays.toString(solution(arr, divisor)));
	}

	 public static int[] solution(int[] arr, int divisor) {
		 int[] answer = {};
         ArrayList<Integer> arraylist = new ArrayList<Integer>();
         
         for(int i=0; i<arr.length; i++) {
             if(arr[i]%divisor==0) {
            	 arraylist.add(arr[i]);
             }
         }
         
         if(arraylist.isEmpty()) {
             arraylist.add(-1);
         }
         
         answer = new int[arraylist.size()];
         
         for(int i=0; i<arraylist.size(); i++) {
             answer[i] = arraylist.get(i);
         }
         
         Arrays.sort(answer);
         
         return answer;
	 }
}
