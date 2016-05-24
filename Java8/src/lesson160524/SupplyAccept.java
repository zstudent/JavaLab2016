package lesson160524;

import java.util.concurrent.CompletableFuture;

public class SupplyAccept {

	public static void main(String[] args) {

		/*
		 * () --{supply}---{accept}--> ()
		 */
		CompletableFuture.supplyAsync(() -> "hello")
				.thenAccept(System.out::println).join();

		/*
		 * () --{supply}--{apply}--{accept}--> ()
		 */
		CompletableFuture.supplyAsync(() -> "hello")
				.thenApply(String::toUpperCase).thenAccept(System.out::println)
				.join();
		
		CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> "hell");
		CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> "heaven");
		
//		cf1.acceptEither(cf2, System.out::println).join();
		
//		CompletableFuture.allOf(cf1, cf2).join();
		
//		cf1.thenAcceptBoth(cf2, (s1, s2) -> System.out.println(s1 + " and " + s2)).join();
		
		cf1.runAfterBoth(cf2, () -> {
			System.out.println("hi there!");
		}).join();
		
		

	}

}
