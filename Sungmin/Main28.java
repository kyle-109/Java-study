import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main28 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        int arr[] = new int[tc];
        for(int i = 0; i < tc; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int [] answer1 = solution(arr);
        System.out.println(answer1.toString());
    }


        public static int[] solution(int []arr) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(arr[0]);
            for(int i = 1; i < arr.length; i++){
                if(arr[i] != arr[i-1]){
                    arrayList.add(arr[i]);
                }
            }

            int[] answer = new int[arrayList.size()];
            for(int i = 0; i< answer.length; i++) {
                answer[i] = arrayList.get(i).intValue();
            }


            return answer;
        }
    }


