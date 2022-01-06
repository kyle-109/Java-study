import java.util.Arrays;

public class Main44 {
    public static void main(String[] args) {
        int array[] = {1,5,2,6,3,7,4};
        int commands[][] ={{2,5,3},{4,4,1},{1,7,3}};
        solution(array, commands);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int sum = 0;
        for(int i = 0; i < commands.length; i++){
            sum = commands[i][1] - commands[i][0];

            int arr[] = new int[sum+1];

            for(int j = 0; j < arr.length; j++){
                arr[j] = array[j + (commands[i][0]-1)];
            }
            Arrays.sort(arr);

            answer[i] = arr[commands[i][2]-1];
        }

        return answer;
    }
}
