import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main22 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(solution(s));
	}
	public static boolean solution(String s) {
        boolean answer = true;
        try {
        	for(int i =0; i < s.length(); i++) {
        		Integer.parseInt(s);
        	}
        } catch(NumberFormatException e){
        	return false;
        } 
        if(s.length() != 6 && s.length() != 4) {
        	return false;
        }
        
        return answer;
	}
}
