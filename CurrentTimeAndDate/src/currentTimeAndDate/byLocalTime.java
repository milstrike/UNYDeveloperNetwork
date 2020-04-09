package currentTimeAndDate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class byLocalTime {
	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime = LocalTime.now();
		System.out.println(dateTimeFormatter.format(localTime)); 
	}
}