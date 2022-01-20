class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero_count = 0;
        int correct = 0;
        for(int num: lottos){
            if(num==0){
                zero_count++;
            }
            for(int win: win_nums){
                if(num==win){
                    correct++;
                    break;
                }
            }
        }
        int[] answer = new int[2];
        int[] score = {6, 6, 5, 4, 3, 2, 1};
        answer[0] = score[zero_count+correct];
        answer[1] = score[correct];
        return answer;
    }
}