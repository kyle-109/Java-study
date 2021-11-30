public class Test17 {
	public String solution(String s, int n) {
		String answer = "";
		char[] arr = s.toCharArray();

		for(char temp : arr){
			if(Character.isLowerCase(temp)){
				if(temp + n > 'z'){
					temp -= 26;
				}
			}else{
				if(temp + n > 'Z'){
					temp -= 26;
				}
			}
			answer += temp != ' ' ? (char)(temp + n) : temp;
		}
		
		return answer;
	}
}
