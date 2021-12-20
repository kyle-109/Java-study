class Solution {
    public String solution(int a, int b) {
        int[] dayArr = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int total = 0;
        String answer = "";
        for(int i = 0; i<a; i++){
            total += dayArr[i];
        }
        total+=b;
        int day = total%7;
        switch(day) {
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            case 0:
                answer = "THU";
                break; 
        }
        return answer;
    }
}