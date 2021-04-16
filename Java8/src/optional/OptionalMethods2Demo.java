package optional;

import java.time.LocalDate;
import java.util.Optional;

public class OptionalMethods2Demo {

	public static void main(String[] args) {
		Optional<Integer> opNum = Optional.ofNullable(5);
		Integer num = opNum.orElse(10);
		System.out.println("Value:"+num);
		
		Optional<Integer> opNum2 = Optional.ofNullable(null);
		Integer num2 = opNum2.orElse(10);
		System.out.println("Value:"+num2);
		
		Optional<LocalDate> opDate = Optional.of(LocalDate.of(2015, 12, 18));
		LocalDate date = opDate.orElseGet(() -> LocalDate.now());
		System.out.println("Date:"+date);
		
		Optional<LocalDate> opDate2 = Optional.ofNullable(null);
		LocalDate date2 = opDate2.orElseGet(() -> LocalDate.now());
		System.out.println("Date:"+date2);
		
		
		Optional<Double> opDouble = Optional.ofNullable(4.5);
		double doubleValue = opDouble.orElseThrow(RuntimeException::new);
		System.out.println("DoubleValue:"+doubleValue);
		
		Optional<Double> opDouble2 = Optional.ofNullable(null);
		double doubleValue2 = opDouble2.orElseThrow(RuntimeException::new);
		System.out.println("DoubleValue:"+doubleValue2);

	}

}
