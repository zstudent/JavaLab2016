package lesson160412;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import library.Book;
import library.Book.Topic;

public class MoreExamples2 {

	public static void main(String[] args) {

		Map<Book.Topic, List<Book>> booksByTopic = new HashMap<>();

		Book.library.parallelStream().peek(book -> {
			Topic topic = book.getTopic();
			List<Book> list = booksByTopic.get(topic);
			if (list == null) {
				list = new ArrayList<>();
			}
			list.add(book);
			booksByTopic.put(topic, list);
		}).anyMatch(b -> false);

		System.out.println(booksByTopic);

		Map<Topic, List<Book>> byTopic = Book.library.stream().collect(
				Collectors.groupingBy(Book::getTopic));
		
		System.out.println(byTopic);

	}

}
