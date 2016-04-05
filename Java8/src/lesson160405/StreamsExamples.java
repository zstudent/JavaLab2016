package lesson160405;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamsExamples {
	
	public static void main(String[] args) {
		
		IntStream.iterate(1, i -> i*2).limit(10).forEachOrdered(System.out::println);
		
		List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,5);
		Optional<Integer> max = listOfIntegers.stream().map(i -> i + 1).max(Integer::compareTo);
		
		OptionalInt max2 = IntStream.rangeClosed(1, 5).map(i -> i + 1).max();
		
		Iterator<Integer> it = listOfIntegers.iterator();
		while (it.hasNext()) {
			Integer integer = it.next();
		}
		
		
	}

}
