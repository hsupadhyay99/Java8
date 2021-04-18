package localtimedemo;

import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime time1 = LocalTime.now();
		System.out.println("Current time : "+time1);
				
		LocalTime time2 = LocalTime.parse("12:30");
		System.out.println("time2 : "+time2);
		
		LocalTime time3 =LocalTime.ofSecondOfDay(200);
		System.out.println("time3 : "+time3);

		


	}

}

