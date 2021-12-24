import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main35 {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        System.out.println(solution(A, B));
    }


    public static String solution(int a, int b){
        String answer = "";
        int save = 0;
        int date = 0;
        int [] dateFormat= {0 ,31, 29, 31,30,31,30,31,31,30,31,30,31};
        String []day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= dateFormat[i]; j++) {
                if(date > 6){
                    date = 0;
                }
                if(j == b && i == a){
                    save = date;
                }
                date += 1;
            }
        }
        answer = day[save];

        return answer;
    }
}
