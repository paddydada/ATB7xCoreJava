package DatePackage;

import java.util.Calendar;

public class CalenderDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println("Year: " + cal.get(Calendar.YEAR));
		System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1)); // Months are 0-based
		System.out.println("Day of Month: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of Week: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("Hour (24-hour format): " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute: " + cal.get(Calendar.MINUTE));
		System.out.println("Second: " + cal.get(Calendar.SECOND));
	}

}
