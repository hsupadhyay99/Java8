package foreach.exp;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Cat","Dog","Mouse");
		list.forEach(str -> System.out.println("Animal is:"+str));
		
		
//		for(String str:list) {
//			System.out.println("Animal is:"+str);
//		}

	}

}
