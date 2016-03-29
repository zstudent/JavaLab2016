package lesson160317;

import java.util.Arrays;

public class Exmaple02 {
	
	public static void main(String[] args) {
		
		String[] a = {"one","two", "three"};
		
		for (String string : a) {
			System.out.println(a);
		}
		
		Arrays.asList(a).forEach(p -> System.out.println(p));

		Arrays.asList(a).forEach(System.out::println);
		
	}

}
