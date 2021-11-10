class Covering_The_Number {
    public String solution(String phone_number) {		 
	StringBuilder answer = new StringBuilder(phone_number);
		 
	for(int i = 0; i < phone_number.length()-4; i++) {
		answer.setCharAt(i, '*');
	}
	return answer.toString();
    }
    
    public static void main(String[] args) {
    	Covering_The_Number number = new Covering_The_Number();
    	System.out.print(number.solution("01033334444"));
    }
}