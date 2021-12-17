
public class Test30 {
	public String solution(String s) {
		String[] arr = s.split("");

		if(s.length() % 2 == 0){
			return arr[s.length() / 2 - 1] + arr[s.length() / 2];
		}else{
			return arr[s.length() / 2];
		}
	}
}
