public class Test07 {
	public int solution(long num) {
		int answer = 0;

		if(num != 1){
			for(int i = 1; 500>=i; i++){
				if(num % 2 == 0){
					num = num / 2;
				}else{
					num = (num * 3) + 1;
				}

				if(i == 500 && num != 1){
					answer = -1;
				}else if(num == 1){
					answer = i;
					break;
				}
			}
		}
		return answer;
	}
}
