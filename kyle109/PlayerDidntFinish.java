//일일이 비교한 경우
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        //두배열모두 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);
        //완주한 길이만큼 반복해서 비교
        for(int i = 0 ; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        //for문 안에서 return이 없으면 참가자중 가장 마지막사람을 리턴
        return participant[participant.length-1];
    }
}

//해시를 사용한 경우
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = ""; 
        HashMap<String, Integer> map = new HashMap<>(); 
        //없으면 디폴트값으로 0, 이미 추가한 적 있으면 원래 값에 1더해서 다시 넣기.
        for(String player : participant) 
            map.put(player, map.getOrDefault(player, 0) + 1);   
        //완주한 사람은 값을 하나씩 빼기.
        for(String player : completion) 
            map.put(player, map.get(player) - 1); 
        //값이 1인 키를 찾기
        for(String key: map.keySet()){
            if(map.get(key)==1){
                answer = key;
                break;
            }
        }
        return answer;
    }
}