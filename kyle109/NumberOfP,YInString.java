class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int p_number = 0;
        int y_number = 0;
        char[] list = s.toCharArray();
        for(int i =0; i<list.length; i++){
            if(list[i] == 80 || list[i] == 112){
                p_number+=1;
            }
            if(list[i] == 89 || list[i] == 121){
                y_number+=1;
            }     
        }
        if(p_number==y_number){
            answer = true;
        }
        return answer;
    }
}