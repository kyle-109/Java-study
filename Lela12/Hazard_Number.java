import java.util.Scanner;

public class Hazard_Number {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        
        System.out.println(hazardNum(x));
        
    }
    
    public static boolean hazardNum(int x){
        
        //반환값 선언
        boolean answer = false;
        
        int temp = x;    //자릿수 합을 계산할때 사용하는 임시 변수
        int sum = 0;    //자릿수의 합
        
        while(temp/10 != 0){
            sum += temp%10; //x를 10으로 나누어 나머지들은 자릿수이며 sum에 더해줌
            temp = temp/10;    //다음 자릿수를 위해 나누기
        }
        
        sum += temp;    //제일 마지막에 남는 몫이 마지막 자릿수기때문에 sum에 더해줌
        
        
        //입력값을 자릿수의 합으로 나누었을때 떨어지면
        if(x%sum == 0){
            answer = true;    //하샤드 수이므로 true
        }
        
        //System.out.println(sum);
        
        return answer;
    }
 
}
