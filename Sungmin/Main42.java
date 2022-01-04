public class Main42 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int stu[] = new int[n+2];
        for(int i=0; i<=n+1; i++){
            stu[i] = 1;
        }

        for(int i =0; i< lost.length; i++){
            stu[lost[i]] = 0;
        }
        for(int i =0; i< reserve.length; i++){
            stu[reserve[i]]++;
        }

        for(int i =1; i <= n; i++){
            if(stu[i] >=1){
                answer++;
            }
            else if(stu[i-1] == 2){
                answer++;
                stu[i-1]--;
            }
            else if(stu[i+1] == 2){
                answer++;
                stu[i+1]--;
            }

        }

        return answer;
    }
}
