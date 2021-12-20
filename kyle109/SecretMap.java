import java.lang.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];
        String[] answer = new String[n];
        for(int i = 0; i<n; i++){
            strArr1[i] = Integer.toBinaryString(arr1[i]);
            strArr2[i] = Integer.toBinaryString(arr2[i]);
            while(strArr1[i].length()!=n){
                strArr1[i] = "0"+strArr1[i];
            }
            while(strArr2[i].length()!=n){
                strArr2[i] = "0"+strArr2[i];
            }
            StringBuilder sb = new StringBuilder();
            for(int j =0; j<n; j++){
                if(strArr1[i].charAt(j) == '0' && strArr2[i].charAt(j) == '0'){
                    sb.append(" ");
                }
                else{
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}