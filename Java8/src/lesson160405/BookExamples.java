package lesson160405;

import java.util.Comparator;
import java.util.stream.Stream;

import library.Book;
import library.Book.Topic;

public class BookExamples {


	public static void main(String[] args) {


		Stream<Book> filteredStream = Book.library.stream().filter(
				b -> b.getTopic() == Topic.PROGRAMMING);

		Stream<String> map = Book.library.stream().map(b -> b.getTitle());

		Book.library.stream().sorted(Comparator.comparing(Book::getTitle));

		Book.library.stream().sorted(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});

	}

}
