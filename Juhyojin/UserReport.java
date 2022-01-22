import java.util.*;

public class UserReport {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] result = solution(id_list, report, k);

        for(int i : result) System.out.println(i);

    }
    static int[] solution(String[] id_list, String[] report, int k){
        int[] answer = new int[id_list.length];

        HashMap<String, Set<String>> userList = new HashMap<>();
        HashMap<String, Integer> reportList = new HashMap<>();

        for (String id : id_list) {
            userList.put(id, new HashSet<String>());
            reportList.put(id, 0);
        }

        for(String str : report) {
            String[] strArr = str.split(" ");
            String user = strArr[0];
            String targetUser = strArr[1];
            if(userList.get(user).add(targetUser)) {
                reportList.put(targetUser, reportList.get(targetUser) + 1);
            }
        }

        for(String str : report) {
            String[] strArr = str.split(" ");
            String user = strArr[0];
            String targetUser = strArr[1];
            if(reportList.get(targetUser) < k) {
                userList.get(user).remove(targetUser);
            }
        }

        for(int i = 0; i < id_list.length; i++) answer[i] = userList.get(id_list[i]).size();

        return answer;
    }
}
