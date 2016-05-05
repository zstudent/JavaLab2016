package lesson160505;

import java.util.stream.IntStream;

public class StreamsExamples {

	public static void main(String[] args) {
		
		IntStream.range(0, args.length).forEach(i -> {
			System.out.println(args[i]);
		});
		
	}
	
}
