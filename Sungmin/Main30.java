public class Main30 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            int count = 0;
            if(s.length()%2 == 0){
                count = s.length()/2;
                answer += s.charAt(count-1);
                answer += s.charAt(count);
            } else{
                count = s.length()/2;
                answer += s.charAt(count);
            }

            return answer;
        }
    }
}
