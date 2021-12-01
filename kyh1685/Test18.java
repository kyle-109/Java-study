public class Test18 {
	public int solution(String s) {

		int answer = 0;
		String[] arr = s.split("");
		String str = "";

		if(arr[0].equals("-")){
			for(int i = 1; arr.length > i; i++){
				str += arr[i];
			}
			answer = Integer.parseInt(str) * -1;
		}else{
			for(int i = 0; arr.length > i; i++){
				str += arr[i];
			}
			answer = Integer.parseInt(str);
		}

		return answer;
	}
}
