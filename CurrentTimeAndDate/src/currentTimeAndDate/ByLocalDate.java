package currentTimeAndDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ByLocalDate {
	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.now();
		System.out.println(dateTimeFormatter.format(localDate)); 
	}
}
