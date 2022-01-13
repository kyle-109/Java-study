public class Main49 {
    public static void main(String[] args) {

    }
    public int solution(int[] numbers) {
        int answer = 0;
        int arr[] = new int[10];
        for(int i = 0; i < numbers.length; i++){
            arr[numbers[i]]++;
        }
        for(int i = 0; i < 10; i++){
            if(arr[i] == 0){
                answer += i;
            }
        }
        return answer;
    }
}
