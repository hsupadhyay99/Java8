package foreach.exp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachDemo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,7,12,9,4);
		
		List<Integer> squaresList = new ArrayList<Integer>();
		
		list.forEach(num ->squaresList.add(num*num) );
		
		System.out.println("Input List:");
		list.forEach(num -> System.out.println(num));
		
		System.out.println("Squares List:");
		squaresList.forEach(num -> System.out.println(num));

	}

}
