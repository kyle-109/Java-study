public class Main41 {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;
        int []arr = new int[200001];
        for(int i =0; i < nums.length; i++){
            arr[nums[i]]++;
        }
        for(int i=0; i < arr.length; i++){
            if(arr[i] >= 1 && nums.length/2 > count){
                count++;
            }
        }
        answer = count;
        return answer;
    }
}
