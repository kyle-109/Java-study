class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        //일단 모두 갖는다고 가정
        int answer = n;
        //분실한 사람은 -1
        for (int l : lost) 
            people[l-1]--;
        //여벌이 있는 사람은 +1
        for (int r : reserve) 
            people[r-1]++;
 
        for (int i = 0; i < people.length; i++) {
            //만약 이사람이 분실한 사람이면
            if(people[i] == -1) {
                //첫번째 사람이 아니고, 앞의 사람이 1이면
                if(i-1>=0 && people[i-1] == 1) {
                    //앞 사람것을 갖는다.
                    people[i]++;
                    people[i-1]--;
                //마지막 사람이 아니고, 뒤의 사람이 1이면
                }else if(i+1< people.length && people[i+1] == 1) {
                    //뒷 사람것을 갖는다.
                    people[i]++;
                    people[i+1]--;
                //위의 두가지 경우에 해당이 안되면 받을 수 있는 경우가 없으므로 하나 빼기
                }else 
                    answer--;
            }
        }
        return answer;
    }
}