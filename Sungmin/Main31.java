public class Main31 {

}

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] str1 = new String[n];
        String[] str2 = new String[n];

        for(int i=0; i<n; i++){
            String st = "";
            String temp1 = Integer.toBinaryString(arr1[i]);
            while(temp1.length() < n) temp1 = "0" + temp1;
            str1[i] = temp1;

            String temp2 = Integer.toBinaryString(arr2[i]);
            while(temp2.length() < n) temp2 = "0" + temp2;
            str2[i] = temp2;

            for(int j=0; j<n; j++){
                int item1 = (int)(str1[i].charAt(j) - '0');
                int item2 = (int)(str2[i].charAt(j) - '0');
                st += (item1+item2 != 0) ? "#" : " ";

            }
            answer[i] = st;
        }

        return answer;
    }
}