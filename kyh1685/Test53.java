
public class Test53 {
	public String solution(String new_id) {
		String answer = "";
		StringBuilder sb = new StringBuilder();

		// 모든 문자를 소문자로 치환
		new_id = new_id.toLowerCase();

		// 사용하지않는 문자 제거
		for(int i = 0; new_id.length() > i; i++){
			if(new_id.charAt(i) >= 'a' && new_id.charAt(i) <= 'z' // 알파벳 소문자
					|| new_id.charAt(i) >= '0' && new_id.charAt(i) <= '9' // 숫자
					|| new_id.charAt(i) == '-' // 빼기(-)
					|| new_id.charAt(i) == '_' // 밑줄(_)
					|| new_id.charAt(i) == '.' // 마침표(.)
			){
				sb.append(new_id.charAt(i));
			}
		}

		// 마침표(.) 두개 이상이면 하나로 치환
		new_id = sb.toString().replace("..", ".");

		while (new_id.contains("..")) {
			new_id = new_id.replace("..", ".");
		}

		// 마침표(.)가 처음이나 끝에 있으면 제거
		for(int i = 0; new_id.length() > i; i++){
			if(new_id.charAt(0) == '.'){
				new_id = new_id.substring(1);
			}else if(new_id.charAt(new_id.length() - 1) == '.'){
				new_id = new_id.substring(0, new_id.length() - 1);
			}
		}

		// 빈 문자열이면 a 대입
		if(new_id.equals("")){
			new_id = "a";
		}

		// 문자열 길이가 16이상이면 15개 문자를 제외한 나머지 문자 제거
		if(new_id.length() > 15){
			new_id = new_id.substring(0, 15);

			// 문자열 끝에 마침표가 있다면 제거
			for(int i = 0; new_id.length() > i; i++){
				if(new_id.charAt(new_id.length() - 1) == '.'){
					new_id = new_id.substring(0, new_id.length() - 1);
				}
			}
		}

		while(new_id.length() < 3){
			new_id += new_id.charAt(new_id.length() - 1);
		}

		return new_id;
	}
}
