package listshorting;

import java.util.Arrays;
import java.util.List;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("Apple","mango","banana");
	
//		for(int i=0; i < input.size();i++) {
//			input.set(i, input.get(i).toUpperCase());
//		}
		
		input.replaceAll(str -> str.toUpperCase());
//		
		for(String fruit:input) {
			System.out.println(fruit);
		}

	}

}
