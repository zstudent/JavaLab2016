package lesson160519;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplyVsCompose {
	
	public static void main(String[] args) {
		
//		Executor executor = new Executor() { // Direct executor
//			
//			@Override
//			public void execute(Runnable command) {
//				command.run();
//			}
//		};
		
//		ExecutorService service = Executors.newFixedThreadPool(2);
		
		CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> "hello");
		
		
		CompletableFuture<String> thenApply = cf1.thenApply(s -> s.toUpperCase());
		CompletableFuture<String> thenCompose = cf1.thenCompose(s -> CompletableFuture.supplyAsync(() -> s.toUpperCase()));
	
		thenCompose.thenAccept(System.out::println).join();
		
		
	}

}
