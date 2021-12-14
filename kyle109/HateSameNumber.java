import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
        int temp = -1;
        for(int i =0; i<arr.length;i++){
            if(temp==arr[i]){
                continue;
            }
            temp = arr[i];
            arrayList.add(arr[i]);
        }
        int[] answer = new int[arrayList.size()];
        for(int j = 0; j<arrayList.size(); j++){
            answer[j]=arrayList.get(j);
        }
        return answer;
    }
}