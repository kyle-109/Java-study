
public class Test45 {
	public String solution(String[] participant, String[] completion) {
		Map<String, Integer> map = new HashMap<>();

		for(String part : participant){
			if(map.containsKey(part)){
				int count = map.get(part);
				map.put(part, count + 1);
			}else{
				map.put(part, 1);
			}
		}

		for(String comp : completion){
			if(map.containsKey(comp)){
				if(map.get(comp) > 1){
					// 동명이인 존재
					int count = map.get(comp);
					map.put(comp, count - 1);
				}else{
					map.remove(comp);
				}
			}
		}

		String answer = map.keySet().toString();

		return answer.substring(1, answer.length() - 1);
	}
}
