public class Test15 {
	public String solution(String s) {
		String answer = "";
		String[] arr = s.split("");
		int count = 0;

		for(String str : arr){
			if(str.isBlank()){
				count = 0;
				answer += " ";
			}else{
				answer += count % 2 == 0 ? str.toUpperCase() : str.toLowerCase();
				count++;
			}
		}
		return answer;
	}
}
