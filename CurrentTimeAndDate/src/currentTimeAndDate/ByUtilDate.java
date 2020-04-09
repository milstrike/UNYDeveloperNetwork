package currentTimeAndDate;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ByUtilDate {
	public static void main(String[] args) {
		DateFormat formatTanggal = new SimpleDateFormat("HH:mm:ss dd/MMMM/yyyy");
		Date tanggal = new Date();
		System.out.println(formatTanggal.format(tanggal));
	}
}