package lesson160412;

import java.util.Optional;

import library.Book;

public class MoreStreamExamples {

	public static void main(String[] args) {

		long count = Book.library.stream()
				.filter(b -> b.getTopic() == Book.Topic.FICTION).count();

		System.out.println(count);

		Optional<Book> anyFictionBook = Book.library.stream()
				.filter(b -> b.getTopic() == Book.Topic.FICTION).findAny();

		Book emptyBook = new Book() {
			@Override
			public String toString() {
				return "None";
			};
		};
		Book someBook = anyFictionBook.orElse(emptyBook);
		System.out.println(someBook);
		
		Book b = getBook();
		
		b = b == null? emptyBook : b;
		
		Book b2 = Optional.ofNullable(getBook()).orElse(emptyBook);

	}
	
	static Book getBook() {
		// do something
		return null;
	}

	static Optional<Book> getBook2() {
		Book b = null;
		// do something
		return Optional.ofNullable(b);
	}
	
}
