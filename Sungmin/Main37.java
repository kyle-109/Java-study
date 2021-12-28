import java.util.Arrays;

public class Main37 {
    public static void main(String[] args) {
        int []d = {1,3,2,5,4};
        System.out.println(solution(d, 9));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {
                answer = i;
                break;
            }
        }
        if(budget <= sum){
            answer =d.length;
        }
        return answer;
    }
}
