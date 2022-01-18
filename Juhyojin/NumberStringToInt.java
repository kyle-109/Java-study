import java.util.*;

public class NumberStringToInt {
    public static void main(String[] args) {
        String str = "one4seveneight";
        System.out.println(solution(str));
    }
    static int solution(String s){
        List<String> list = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        char[] charArr = s.toCharArray();
        String result = "";
        String temp = "";

        for(char c : charArr) {
            if(Character.isDigit(c)) result += c;
            else {
                temp += c;
                if(list.contains(temp)){
                    result += list.indexOf(temp);
                    temp = "";
                }
            }
        }

        return Integer.parseInt(result);
    }
}
