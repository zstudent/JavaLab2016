package lesson160405;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class BookExamples {

	enum Topic {
		PROGRAMMING, FICTION, SHORT
	}

	static class Book {

		String title;
		int[] pageCounts;
		double height;
		Topic topic;

		public Topic getTopic() {
			return topic;
		}

		public void setTopic(Topic topic) {
			this.topic = topic;
		}

		public Book(String title, int[] pageCounts, double height, Topic topic) {
			super();
			this.title = title;
			this.pageCounts = pageCounts;
			this.height = height;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int[] getPageCounts() {
			return pageCounts;
		}

		public void setPageCounts(int[] pageCounts) {
			this.pageCounts = pageCounts;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

	}

	public static void main(String[] args) {

		Book b1 = new Book("Sherlock Holmes", new int[] { 256 }, 25.5,
				Topic.SHORT);
		Book b2 = new Book("Tom Sawyer", new int[] { 300 }, 20.5, Topic.FICTION);
		Book b3 = new Book("War and Peace", new int[] { 500, 450, 300, 600 },
				50.0, Topic.FICTION);
		Book b4 = new Book("Java8 basics", new int[] { 100 }, 15.0,
				Topic.PROGRAMMING);

		List<Book> library = Arrays.asList(b1, b2, b3, b4);
		
		Stream<Book> filteredStream = library.stream().filter(b -> b.getTopic() == Topic.PROGRAMMING);
		
		Stream<String> map = library.stream().map(b -> b.getTitle());
		
		library.stream().sorted(Comparator.comparing(Book::getTitle));

		library.stream().sorted(new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});
		
	}

}
