package localdatedemo;

import java.time.LocalDate;

public class LocalDateCreationDemo {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println("Date1:"+date1);
		
		LocalDate date2 = LocalDate.parse("2012-12-10");
		System.out.println("Date2:"+date2);
		
		LocalDate date3 = LocalDate.of(2017, 5, 8);
		System.out.println("Date3:"+date3);
		
		LocalDate date4 = LocalDate.ofYearDay(2018, 15);
		System.out.println("Date4:"+date4);

	}

}
