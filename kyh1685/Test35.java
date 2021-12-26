
public class Test35 {
	public String solution(int a, int b) {
		LocalDate date = LocalDate.of(2016, a, b);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		String answer = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US);

		return answer.toUpperCase();
	}
}
