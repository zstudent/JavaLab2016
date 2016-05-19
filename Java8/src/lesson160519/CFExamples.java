package lesson160519;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExamples {
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(4); 
		
		CompletableFuture.supplyAsync(() -> "hello", service).thenAcceptAsync(System.out::println)
		 .thenRun(service::shutdown);
		
	}

}
