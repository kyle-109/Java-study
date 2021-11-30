import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main17 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		System.out.println(solution(s, n));
	}
	
	public static String solution(String s, int n) {
		char[] arr = s.toCharArray();
        
        for (int i=0; i< s.length() ; i++ )
        {
            if (arr[i] == ' ') {
                 arr[i] = ' '; 
                 continue;
            }
           
            if (arr[i] >='a' && arr[i] <= 'z') {
                if (arr[i] + n > 'z') {
                    arr[i] = (char)( arr[i] + n - 26) ;
                } 
                else {
                     arr[i] += n;
                }
              
            } 
            else if (arr[i] >='A' && arr[i] <= 'Z') {
                if (arr[i] + n > 'Z') {
                    arr[i] = (char) ( arr[i] + n - 26);
                } 
                else {
                     arr[i] += n;
                }
            }
        }     
        String answer = String.valueOf(arr);
        return answer;
	}
}
