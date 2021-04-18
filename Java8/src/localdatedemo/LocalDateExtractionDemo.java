package localdatedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExtractionDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2010-09-14");
		
		int day = date.getDayOfYear();
		System.out.println("DayOFYear : "+day);
		
		int dayOfMonth = date.getDayOfMonth();
		System.out.println("DayOfMonth: "+dayOfMonth);
		
		Month month = date.getMonth();
		System.out.println("Month: "+month);
		
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println("DayOfWeek: "+dayOfWeek);
		

	}

}
