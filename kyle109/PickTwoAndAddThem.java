import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        Integer[] answer = set.toArray(new Integer[set.size()]);
        Arrays.sort(answer);
        return answer;
    }
}