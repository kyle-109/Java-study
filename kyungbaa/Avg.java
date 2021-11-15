class Avg{
    public double solution(int[] arr) {
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        
        double answer = (double)sum / arr.length;
        
        return answer;
    }
}
