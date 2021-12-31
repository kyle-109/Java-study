import java.util.ArrayList;
import java.util.Collections;

class Solution {
    
    static class Rate{
        int idx;	// stage number
        double rate; 	// fail rate

        public Rate(int idx, double rate) {
            this.idx = idx;
            this.rate = rate;
        }
    }
    
    public static int[] solution(int N, int[] stages) {


        int[] user_cnt = new int[N + 2];	// 각 stage에 머물러있는 user 수
        int[] user_total_cnt = new int[N + 1];	// 각 stage에 도달한 전체 user 수

        for (int i = 0; i < stages.length; i++) {
            user_cnt[stages[i]]++;
        }

        // 스테이지에 도달한 유저 수 누적(?)하여 구하기
        // 맨 마지막 stage는 n번째 + (n+1)번째
        user_total_cnt[N] = user_cnt[N] + user_cnt[N + 1]; 
        for (int i = N-1; i >= 1; i--) {
            user_total_cnt[i] = user_cnt[i] + user_total_cnt[i + 1];
        }

        ArrayList<Rate> arr = new ArrayList<>(); // stage 번호와 실패율을 저장
        for (int i = 1; i <= N; i++) {
            
            if(user_total_cnt[i]==0){ //스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0
                arr.add(new Rate(i, 0));
                continue;
            }
            
            double rate = (double) user_cnt[i] / user_total_cnt[i];
            arr.add(new Rate(i, rate));
        }

        // fail rate가 높은 순으로 sorting
        Collections.sort(arr, ((o1, o2) -> Double.compare(o2.rate, o1.rate)));

        // sorting 된 실패율의 stage 번호 저장
        int[] answer = new int[N];
        for (int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i).idx;
        }
        
        return answer;
    }
}