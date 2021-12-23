import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main33 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution(n));

    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                return answer;
            }
        }
        return answer;

    }
}

