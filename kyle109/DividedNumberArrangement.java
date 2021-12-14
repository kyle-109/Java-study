import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int temp : arr){
            if(temp%divisor==0){
                arrayList.add(temp);
            }
        }
        if(arrayList.size()==0){
            arrayList.add(-1);
        }
        int[] answer = new int[arrayList.size()];
        for(int i =0; i<answer.length; i++){
            answer[i]=arrayList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}