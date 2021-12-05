public class Test21 {
	public String solution(String[] seoul) {
		int x = 0;

		for(int i = 0; seoul.length > i; i++){
			if(seoul[i].equals("Kim")){
				x = i;
				break;
			}
		}

		return "김서방은 " + x + "에 있다";
	}
}
