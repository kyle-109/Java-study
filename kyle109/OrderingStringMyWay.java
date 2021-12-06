import java.util.*;

class Solution {
  public String[] solution(String[] strings, int n) {
      
      Arrays.sort(strings, new Comparator<String>() {
          @Override
          public int compare(String s1, String s2){
              char c1 = s1.charAt(n);
              char c2 = s2.charAt(n);
              
              // n번째 문자가 같을 경우에 원본 스트링을 사전순으로
              if(c1 == c2){
                  return s1.compareTo(s2);
              } else return c1 - c2;
          }
      });
      
      return strings;
  }
}


/*
class Solution {
    public String[] solution(String[] strings, int n) {
        String temp = "";
        for(int j = 0; j<strings.length; j++){
            for(int k = j+1; k<strings.length; k++){
                if(strings[j].charAt(n) > strings[k].charAt(n)){
                    temp = strings[j];
                    strings[j] = strings[k];
                    strings[k] = temp;
                    continue;
                }
                if(strings[j].charAt(n) == strings[k].charAt(n)){
                    int length = strings[j].length()>strings[k].length() ? strings[k].length() : strings[j].length();
                    for(int i=0; i<length; i++){
                        if(strings[j].charAt(i)>strings[k].charAt(i)){
                            temp = strings[j];
                            strings[j] = strings[k];
                            strings[k] = temp;
                            break;
                        }
                            
                    }
                }
            }
        }
        String[] answer = strings;
        return answer;
    }
}
*/