package lesson160425;

import java.util.Arrays;
import java.util.OptionalInt;

public class ReduceExamples {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		
		sum = Arrays.stream(numbers).parallel().reduce(0, (a,b) -> a + b);
		
		
		System.out.println(sum);
		
		int product = Arrays.stream(numbers).parallel().reduce(1, (a,b) -> a * b);
		
		sum = Arrays.stream(numbers).parallel().reduce(0, Integer::sum);
		
		OptionalInt reduce = Arrays.stream(numbers).parallel().reduce((a,b) -> a + b);
		
		Arrays.stream(numbers).reduce(Integer::max);
		int count = Arrays.stream(numbers).map(d -> 1).reduce(0, Integer::sum);
		
		System.out.println(count);
	}

}
