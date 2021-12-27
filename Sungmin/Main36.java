import java.util.ArrayList;

public class Main36 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int[] arr = new int[2000];
        for(int i= 0; i<numbers.length;i++){
            for(int j=i+1; j<numbers.length;j++){
                arr[numbers[i]+numbers[j]]++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                arr2.add(i);
            }
        }
        int [] answer = new int[arr2.size()];
        for(int i =0; i< arr2.size();i++){
            answer[i] = arr2.get(i);
        }

        return answer;
    }
}
