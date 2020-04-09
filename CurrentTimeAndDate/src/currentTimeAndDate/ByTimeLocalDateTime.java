package currentTimeAndDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ByTimeLocalDateTime {
	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
		LocalDateTime getNow = LocalDateTime.now();
		System.out.println(dateTimeFormatter.format(getNow));
	}
}