public class Test22 {
	public boolean solution(String s) {
		boolean answer = true;
		String[] arr = s.split("");

		if(arr.length == 4 || arr.length == 6){
			try{
				for(int i = 0; arr.length > i; i++){
					Integer.parseInt(arr[i]);
				}
			}catch(NumberFormatException e){
				answer = false;
			}
		}else{
			answer = false;
		}
		
		return answer;
	}
}
