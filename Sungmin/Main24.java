import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main24 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		System.out.println(solution(n));
	}
	static boolean solution(String s) {
        boolean answer = true;
        int countp = 0;
        int county = 0;
        for(int i= 0; i < s.length(); i++) {
        	if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
        		countp++;
        	}
        	if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
        		county++;
        	}
        }
        if(countp != county) {
        	answer = false;
        }
        
        return answer;
    }
}
