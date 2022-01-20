import java.util.*;

public class LottoRank {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] result = solution(lottos, win_nums);

        for(int i : result) System.out.println(i);
    }
    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0, count = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i : win_nums) list.add(i);

        for(int i : lottos) {
            if(i == 0) zero++;
            if(list.contains(i)) count++;
        }

        answer[0] = rankCheck(zero+count);
        answer[1] = rankCheck(count);

        return answer;
    }
    static int rankCheck(int num) {
        switch (num) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
