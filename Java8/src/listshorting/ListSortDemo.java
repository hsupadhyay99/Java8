package listshorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(99,12,54,32,23,65);
		
//		Collections.sort(input);
		
		input.sort((num1,num2) -> num1-num2);
		
		input.forEach(num -> System.out.print(num+" "));
	}

}
