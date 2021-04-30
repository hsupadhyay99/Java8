package array;

import java.util.Arrays;
import java.util.Collections;

public class Search_MinMax_in_array {

	public static void main(String[] args) {
		Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5 };
		int min = (int) Collections.min(Arrays.asList(numbers));
		int max = (int) Collections.max(Arrays.asList(numbers));

		System.out.println("Min number: " + min);
		System.out.println("Max number: " + max);
		
		main1(args);
	}

	public static void main1(String[] args) {
	      int numbers[] = new int[]{8, 2, 7, 1, 4, 9, 5};
	      int s = numbers[0];
	      int l = numbers[0];
	      
	      for(int i = 1; i < numbers.length; i++) {
	         if(numbers[i] > l)l = numbers[i];
	         else if (numbers[i] < s)s = numbers[i];
	      } 
	      System.out.println("Largest Number is : " + l);
	      System.out.println("Smallest Number is : " + s);
	   }

}
