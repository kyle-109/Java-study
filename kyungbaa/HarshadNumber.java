package javaStudy;
public class HarshadNumber{
    public boolean isHarshad(int num){
        String str = num+"";
        int sum=0, result;

    for(int i=0; i<str.length(); i++){
         sum += Integer.parseInt(str.substring(i,i+1));
    }

    result = num % sum;

    if(result == 0)
      return true;
    else
      return false;

    }

       // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(18));
    }
}
