package currentTimeAndDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ByUtilCalendar {
	public static void main(String[] args) {
		DateFormat formatTanggal = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		Calendar kalender = Calendar.getInstance();
		System.out.println(formatTanggal.format(kalender.getTime()));	
	}
}