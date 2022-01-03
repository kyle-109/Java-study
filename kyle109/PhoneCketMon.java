import java.util.*;
class Solution {
    public int solution(int[] nums) {
        //입력받은 int배열을 Integer배열로 변경
        Integer[] ints = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        //Integer배열을 HashSet으로 변환.
        //중복된 값을 지우기 위해서
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(ints));
        //만약 중복값을 지워도 입력받은 배열 크기의 반보다 갯수가 많다면 크기의 반을 리턴
        if(set.size()>=(nums.length/2)){
            return nums.length/2;
        }
        //아니라면 set의 크기만큼만 리턴
        else{
            return set.size();
        }
    }
}