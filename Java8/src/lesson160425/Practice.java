package lesson160425;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String... args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian,
				2011, 300), new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400), new Transaction(mario, 2012,
						710), new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));

		// Query 1: Find all transactions from year 2011 and sort them by value
		// (small to high).

		List<Transaction> result = transactions.stream()
				.filter(t -> t.getYear() == 2011)
				.sorted(comparing(Transaction::getValue)).collect(toList());

		// Query 2: What are all the unique cities where the traders work?

		List<String> cities = transactions.stream()
				.map(t -> t.getTrader().getCity()).distinct().collect(toList());

		System.out.println(cities);

		// Query 3: Find all traders from Cambridge and sort them by name.

		List<Trader> tradersFromCambridge = transactions.stream().map(t -> t.getTrader()).distinct()
				.filter(trader -> trader.getCity().equals("Cambridge"))
				.sorted(comparing(Trader::getName))
				.collect(toList());
		
		System.out.println(tradersFromCambridge);

		// Query 4: Return a string of all traders’ names sorted alphabetically.
		
		String traderNamesList = transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted()
		.reduce("Traders: ", (t1, t2) -> t1 + ", " + t2);
		
		System.out.println(traderNamesList);

		traderNamesList = transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted()
				.collect(Collectors.joining(", "));
		
		System.out.println(traderNamesList);
		
		// Query 5: Are there any trader based in Milan?
		
		boolean anyFromMilan = transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));
		
		System.out.println(anyFromMilan);
		
		
		// Query 6: Update all transactions so that the traders from Milan are
		// set to Cambridge.
		
//		transactions.stream().filter(t -> t.getTrader().getCity().equals("Milan"))
//			.peek(t -> {
//				t.getTrader().setCity("Cambridge");
//			}).anyMatch(t -> false);
//		
//		System.out.println(transactions);
//		
//		transactions.stream().filter(t -> t.getTrader().getCity().equals("Milan"))
//		.forEach(t -> {
//			t.getTrader().setCity("Cambridge");
//		});
//		
//		System.out.println(transactions);
		
		transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
		.forEach(t -> System.out.println(t.getValue()));
		
		transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
		.map(Transaction::getValue).forEach(System.out::println);
		
		
		// Query 7: What's the highest value in all the transactions?
		
		transactions.stream().map(Transaction::getValue).reduce((a,b) -> a > b? a : b);
		Optional<Integer> max = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
		
		// Query 8: Find transaction with a minimum value
		
		Optional<Transaction> min = transactions.stream().min(comparing(Transaction::getValue));
		Optional<Transaction> min2 = transactions.stream().reduce((t1,t2) -> t1.getValue() < t2.getValue() ? 
				t1 : t2);
		
	}
}