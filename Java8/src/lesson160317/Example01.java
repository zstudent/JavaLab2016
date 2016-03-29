package lesson160317;

import java.util.Arrays;

public class Example01 {
	
	public static void main(String[] args) {
		
		Integer[] a = {10,20,-30, 23, 16, 3, 91, 0};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a, (x,y) -> Integer.compareUnsigned(x,y));
		
		Arrays.sort(a, Integer::compareUnsigned);

		System.out.println(Arrays.toString(a));
	}

}
