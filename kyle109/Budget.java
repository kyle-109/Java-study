import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int[] num = d;
        Arrays.sort(num);
        int answer = 0;
        for(int i = 0; i<d.length; i++){
            budget=budget-num[i];
            if(budget<0){
                break;
            }
            answer+=1;
        }
        return answer;
    }
}