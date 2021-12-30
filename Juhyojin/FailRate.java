package programmers;
import java.util.*;

public class FailRate {

	public static void main(String[] args) {
		int n = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] result = solution(n, stages);
		
		for(int i : result) {
			System.out.print(i + " ");
		}
	}
	
	static int[] solution(int n, int[] stages) {
		HashMap<Integer, Double> failRate = new HashMap<>();
		
		for (int i = 1; i <= n; i++) {
			double passUser = 0;
			double failUser = 0;

			for(int stage : stages) {
				if(stage >= i) passUser++; 
				if(stage == i) failUser++;
			}
			
			if(failUser == 0) {
				failRate.put(i, 0.0);
			} else {
				double rate = failUser / passUser;
				failRate.put(i, rate);
			}
		
		}
		
		List<Integer> keyList = new ArrayList<>(failRate.keySet());
		
		Collections.sort(keyList, (o1, o2) -> (failRate.get(o2).compareTo(failRate.get(o1))));
		
		int[] result = new int[n];
		int index = 0;
		
		for(Integer key : keyList) {
			result[index] = key;
			index++;
		}
		
		return result;
	}

}
