import java.util.*;

public class ExistNum {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};
        System.out.println(solution(numbers));
    }
    static int solution(int[] numbers){
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : numbers) list.add(num);

        for(int i = 0; i <= 9; i++) {
            if(!list.contains(i)) result += i;
        }

        return result;
    }
}
