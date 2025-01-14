package DatePackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDate {

	public static void main(String[] args) {
		Date currentDate = new Date();

		System.out.println(currentDate);

		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat format3 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		SimpleDateFormat format4 = new SimpleDateFormat("E, MMM dd yyyy");
		SimpleDateFormat format5 = new SimpleDateFormat("hh:mm:ss a");
		SimpleDateFormat format6 = new SimpleDateFormat("EEEE, MMMM dd, yyyy HH:mm:ss");

		// Print the current date in multiple formats
		System.out.println("Format 1 (dd/MM/yyyy): " + format1.format(currentDate));
		System.out.println("Format 2 (MM-dd-yyyy): " + format2.format(currentDate));
		System.out.println("Format 3 (ISO-like): " + format3.format(currentDate));
		System.out.println("Format 4 (Day, Month Date Year): " + format4.format(currentDate));
		System.out.println("Format 5 (Time 12-hour): " + format5.format(currentDate));
		System.out.println("Format 6 (Full Date and Time): " + format6.format(currentDate));

	}

}
