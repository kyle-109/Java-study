
public class Test55 {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Set<String> set = new HashSet<>();
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();

		for(String i : report) set.add(i);

		Iterator<String> itor = set.iterator();

		while(itor.hasNext()){
			String name = itor.next().split(" ")[1];

			if(map.containsKey(name)){
				int count = map.get(name);
				map.put(name, ++count);
			}else{
				map.put(name, 1);
			}
		}

		for(Map.Entry<String, Integer> entry : map.entrySet()){
			if(entry.getValue() >= k){
				list.add(entry.getKey());
			}
		}

		Map<String, Integer> result = new LinkedHashMap<>();
		for(String id : id_list) result.put(id, 0);

		Iterator<String> reportUser = set.iterator();

		while(reportUser.hasNext()){
			String[] arr = reportUser.next().split(" ");

			if(list.contains(arr[1])){
				int count = result.get(arr[0]);
				result.put(arr[0], ++count);
			}
		}

		int count = 0;

		for(Map.Entry<String, Integer> entry : result.entrySet()){
			answer[count] = entry.getValue();
			count++;
		}

		return answer;
	}
}
