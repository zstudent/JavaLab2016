package library;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class Book {

	public enum Topic {
		PROGRAMMING, FICTION, SHORT, HUMOR
	}
	
	public static List<Book> library;
	

	static void createLibrary() {
		Book b1 = new Book("Sherlock Holmes", new int[] { 256 }, 25.5,
				Topic.SHORT, Arrays.asList("Arthur Conan Doyle"), Year.of(1920));
		Book b2 = new Book("Tom Sawyer", new int[] { 300 }, 20.5, Topic.FICTION, Arrays.asList("Mark Twain"), Year.of(1930));
		Book b3 = new Book("War and Peace", new int[] { 500, 450, 300, 600 },
				50.0, Topic.FICTION, Arrays.asList("Lev Tolstoy"), Year.of(1900));
		Book b4 = new Book("Java8 basics", new int[] { 100 }, 15.0,
				Topic.PROGRAMMING, Arrays.asList("Smith","Johnes","Peters"), Year.of(2014));
		Book b5 = new Book("12 chairs", new int[] { 230 }, 18.0,
				Topic.HUMOR, Arrays.asList("Ilf","Petrov"), Year.of(2014));
		
		library = Arrays.asList(b1, b2, b3, b4, b5);
	}
	
	static {
		createLibrary();
	}
	

	
	String title;
	int[] pageCounts;
	double height;
	Book.Topic topic;
	List<String> authors;
	Year year;

	public Book(String title, int[] pageCounts, double height, Book.Topic topic,
			List<String> authors, Year year) {
		super();
		this.title = title;
		this.pageCounts = pageCounts;
		this.height = height;
		this.topic = topic;
		this.authors = authors;
		this.year = year;
	}

	public Book() {
	}

	public List<String> getAuthors() {
		return authors;
	}

	public Year getYear() {
		return year;
	}

	public Book.Topic getTopic() {
		return topic;
	}

	public String getTitle() {
		return title;
	}

	public int[] getPageCounts() {
		return pageCounts;
	}

	public double getHeight() {
		return height;
	}

}