class Solution {
    public String solution(String s, int n) {
        //char배열로 변경
        char[] temp = s.toCharArray();
        //for문 돌리기
        for(int i =0; i<temp.length; i++){
            //공백이면 건너뛰기.
            if(temp[i]==' '){
                continue;
            }
            //공백이 아니면 이동
            if(temp[i]<='Z'&&(temp[i]+n)>'Z'){    
                temp[i] = (char)('A'+temp[i]+n-1-'Z');
                continue;
            }
            else if(temp[i]<='z'&&(temp[i]+n)>'z'){
                temp[i] = (char)('a'+temp[i]+n-1-'z');
                continue;
            }
            else{
                temp[i]=(char)(temp[i]+n);
            }

        }
        String answer = String.valueOf(temp);
        return answer;
    }
}