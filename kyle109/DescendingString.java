class Solution {
    public String solution(String s) {
        char temp = ' ';
        String answer = "";
        char[] strlist = s.toCharArray();
        for(int i =0; i<strlist.length; i++){
            for(int j=i+1; j<strlist.length; j++){
                if(strlist[i] < strlist[j]){
                    temp = strlist[i];
                    strlist[i] = strlist[j];
                    strlist[j] = temp;
                }
            }
        }
        answer = String.valueOf(strlist);
        return answer;
    }
}