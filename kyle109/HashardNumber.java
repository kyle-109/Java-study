//https://programmers.co.kr/learn/courses/30/lessons/12947
class Solution {
    public boolean solution(int x) {
	        int init = x;
	        int length = (int)(Math.log10(x)+1);
	        System.out.println("length: "+length);
	        int sum =0;
	        for(int i=0; i<length-1; i++){
	        	System.out.println("더하기 전의 sum: "+sum);
	            sum+=x/Math.pow(10, length-1-i);
	            System.out.println("더한 후의 sum: "+sum);
	            x=(int)(x%Math.pow(10, length-1-i));
	            System.out.println("입력값: "+x);
	        }
	        sum+=x;
	        boolean answer = true;
	        if(init%sum==0){
	            return answer;
	        }    
	        else{
	            answer = false;
	        }
	         return answer;
    }
}