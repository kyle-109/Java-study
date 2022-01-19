public class NewId {
    public static void main(String[] args) {
        String newId = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution(newId));
    }
    static String solution(String newId) {
        newId = newId.toLowerCase();

        newId = newId.replaceAll("[^a-z0-9-_.]","");

        newId = newId.replaceAll("\\.{2,}", ".");

        newId = newId.replaceAll("^(\\.)|(\\.)$","");

        if(newId.isEmpty()) newId = "a";

        if(newId.length() >= 16) newId = newId.substring(0, 15).replaceAll("(\\.)$","");

        while(newId.length() < 3) newId += newId.charAt(newId.length()-1);

        return newId;
    }
}
