package lesson160407;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import library.Book;

public class StreamExamplesContinued {

	public static void main(String[] args) {

		Book.library.stream().sorted(Comparator.comparing(Book::getTitle))
				.flatMap(book -> book.getAuthors().stream()).distinct();

		Book.library.stream().sorted(Comparator.comparing(Book::getTitle))
				.limit(3);

		Book.library.stream().sorted(Comparator.comparing(Book::getTitle))
				.skip(3);

		Stream<String> streamOfTitles = Book.library.stream().map(book -> {
			System.out.println(book);
			return book.getTitle();
		}); // transform

		List<String> titles = streamOfTitles.collect(Collectors.toList()); // terminal
		// // action
		//
		System.out.println(titles);

		int pages = Book.library.stream()
				.flatMapToInt(b -> IntStream.of(b.getPageCounts())).sum();

		System.out.println(pages);
		
		int total = 0;
		for (Book book : Book.library) {
			for (int p : book.getPageCounts()) {
				total += p;
			}
		}
		
		System.out.println(total);

	}

}
